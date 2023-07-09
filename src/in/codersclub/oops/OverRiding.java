package in.codersclub.oops;

class Parent 
{
    public void property()
    {
        System.out.println("Gold,money and land");
    }
    public void marriage()
    {
        System.out.println("Person of parent's choice");
    }
}
class Child extends Parent
{
    /*propert() inherited as it is but marriage() is redefined as child wants marry person of its choice*/
    public void marriage() //overriding
    {
        System.out.println("Person of child's Choice");
    }
}
public class OverRiding
{
    public static void main(String[] args) 
    {
        Parent p=new Parent();
        p.marriage();

        Child c=new Child();
        c.marriage();

        Parent p1=new Child();
        p1.marriage(); /*method in child class will be executed by JVM unlike overloading where the method having argument of parent class is executed by COMPILER*/
    }
}
