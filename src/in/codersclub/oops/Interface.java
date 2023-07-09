package in.codersclub.oops;
interface Interf
{
    public void c1();
    public void c2();
}
class Interface implements Interf
{
    public void c1()
    {
        System.out.println("C1 method");
    }
    public void c2()
    {
        System.out.println("C2 method");
    }
    public static void main(String[] args)
    {
        Interface i = new Interface();
        i.c1();
        i.c2();
    }
}
