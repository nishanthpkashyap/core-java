package in.codersclub.oops;

public class Overloading3 
{
    public void m1(String s)
    {
        System.out.println("String method:\n"+s);
    }
    public void m1(StringBuffer sb)
    {
        System.out.println("StringBuffer method:\n"+sb);
    }
    public static void main(String[] args) 
    {
        Overloading3 obj=new Overloading3();
        obj.m1("nish");
        obj.m1(new StringBuffer("nish"));
        /*obj.m1(null); will give you error because String and StringBuffer are not related to eachother and compiler will get ambigious as to which method it should call*/
    }
}
