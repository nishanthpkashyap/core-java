package in.codersclub.oops;
class One
{
    public void m1()
    {
        System.out.println("parent");
    }
}
class Two extends One
{
    public void m2()
    {
        System.out.println("Child");
    }
}
public class ObjTypeCast1 
{
    public static void main(String[] args) 
    {
        Two c = new Two();
        c.m1(); //valid
        c.m2(); //valid
        ((One)c).m1(); //valid
        /*((One)c).m2(); invalid*/
        
    }
}
