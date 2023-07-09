package in.codersclub.oops;

class Animal 
{}
class Monkey extends Animal
{}
public class Overloading6
{
    public void m1(Animal a)
    {
        System.out.println("Animal Method");
    }
    public void m1(Monkey m)
    {
        System.out.println("Monkey Method");
    }
    public static void main(String[] args) 
    {
        Overloading6 obj=new Overloading6();
        Animal a = new Animal();
        obj.m1(a);
        Monkey m = new Monkey();
        obj.m1(m);
        Animal a1 = new Monkey();
        obj.m1(a1);
    }
}