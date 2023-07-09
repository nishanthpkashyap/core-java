package in.codersclub.sampleprograms;

public class SuperSubCatch 
{
    public static void catchIt()
    {
        try
        {
            int a=0;
            int b=42/a;
            System.out.println(b);
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }
        catch(Exception e)
        {   
            
            System.out.println("Generic Exception Caught");
        }
    }
}
