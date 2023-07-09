package in.codersclub.oops;

public class Overloading1 
{
    public void m1(int i)
    {
        System.out.println("int-arg method:\n"+i);
    }
    public void m1(float i)
    {
        System.out.println("float-arg method:\n"+i);
    }
    public static void main(String[] args) 
    {
        Overloading1 obj = new Overloading1();
        obj.m1(10);
        obj.m1(10.5f);
        obj.m1('a'); /*compiler will convert char to int using ascii and call integer method because no character argument method*/
        obj.m1(10l); /*compiler will promote long to float and call float arg method because long arg method is not available*/
        /*t1.m1(10.5) will give error as double arg method is not available and double cant be promoted to other type*/
    }
}
