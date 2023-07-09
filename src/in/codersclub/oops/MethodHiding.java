package in.codersclub.oops;

public class MethodHiding 
{
    public static void m1()
    {
        System.out.println("Parent method");
    }
}
class Hiding extends MethodHiding
{
    public static void m1() /*this is method hiding NOT overriding*/
    {
        System.out.println("Child Method");
    }
}
class Method
{  
    public static void main(String[] args) 
    {
        MethodHiding p = new MethodHiding();
        p.m1();
        Hiding c = new Hiding();
        c.m1();
        MethodHiding p1 = new Hiding();
        p1.m1();
    }
}
