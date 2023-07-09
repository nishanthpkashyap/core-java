package in.codersclub.oops;

class Parents
{
    public void m1()
    {
        System.out.println("Parent");
    }
}
class Childs extends Parents
{
    public void m2()
    {
        System.out.println("Child");
    }
}
class Driver
{
    public static void main(String[] args) 
    {
        Childs c = new Childs();
        c.m1();
        c.m2();
    }
}
