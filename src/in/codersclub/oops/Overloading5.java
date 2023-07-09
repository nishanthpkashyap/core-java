package in.codersclub.oops;

public class Overloading5 
{
    public void m1(int i,float f)
    {
        System.out.println("int-float method");
    }
    public void m1(float f,int i)
    {
        System.out.println("float-int method");
    }
    public static void main(String[] args) 
    {
        Overloading5 obj=new Overloading5();

        obj.m1(10,10.5f);
        obj.m1(10.5f,10);
        /*obj.m1(10,10); will give error because it is ambiguous*/
        /*obj.m1(10f,10f); here no suitable method gets matched as you cant convert float to int */
    }
}
