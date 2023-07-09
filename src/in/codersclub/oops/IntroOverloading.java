package in.codersclub.oops;

class Overloading 
{
    public void o1()
    {
        System.out.println("No arguments\n");
    }
    public void o1(int i)
    {
        System.out.println("Integer Argument:\n"+i);
    }
    public void o1(double j)
    {
        System.out.println("Float Argument:\n"+j);
    }
    public static void main(String[] args) 
    {
        Overloading obj = new Overloading();
        obj.o1();
        obj.o1(10);
        obj.o1(10.5);
    }
}
