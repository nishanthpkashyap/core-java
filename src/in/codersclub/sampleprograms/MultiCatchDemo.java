package in.codersclub.sampleprograms;

public class MultiCatchDemo 
{
    public static void main(String[] args) 
    {
        try
        {
            int len = args.length;
            System.out.println("lenght = "+len);
            int b=42/len;
            System.out.println(b);
            int c[]={1};
            c[47] = 99;
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }
        catch(ArrayIndexOutOfBoundsException aiobe)
        {
            System.out.println(aiobe);
        }
        System.out.println("After Try/Catch Block");
    }
}
