package in.codersclub.oops;

public class Overloading2 
{
    public void m1(Object o)
    {
        System.out.println("Object-arg method:\n"+o.hashCode());
    }
    public void m1(String a)
    {
        System.out.println("String-arg method:\n"+a);
    }
    public static void main(String args[])
    {
        Overloading2 obj = new Overloading2();
        obj.m1(new Object());
        obj.m1("NISH");
        obj.m1(null);
    }
}
