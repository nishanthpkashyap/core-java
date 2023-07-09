package in.codersclub.oops;

public class Overloading4 
{
    public void m1(int i)
    {
        System.out.println("Normal Integer method:\n"+i);
    }
    public void m1(int... i)
    {
        System.out.println("var-arg method:\n"+i);
    }
    public static void main(String args[])
    {
        Overloading4 obj = new Overloading4();
        obj.m1();
        obj.m1(10,20);
        obj.m1(10);
    }
}
