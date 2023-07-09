package in.codersclub.oops;
class X
{
    public void m1()
    {
        System.out.println("X");
    }
}
class Y extends X
{
    public void m1()
    {
        System.out.println("Y");
    }
}
class Z extends Y
{
    public void m1()
    {
        System.out.println("Z");
    }
}
public class ObjTypeCast2 
{
    public static void main(String[] args) 
    {
        Z z = new Z();
        z.m1();
        ((Y)z).m1();
        ((X)((Y)z)).m1(); /*overriding so output is z z z*/
        
        /*if all methods are static it becomes method hiding so base on reference type output will be given C B A*/
    }
}
