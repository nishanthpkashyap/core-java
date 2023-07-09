package in.codersclub.sampleprograms;

public class NullPointerException 
{
    public static String showexception()
    {
        String s1= null;
        String s2="GREAT";
        String s3=s1.concat(s2);
        return s3;
    }
}
