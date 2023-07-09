package in.codersclub.sampleprograms;

public class RevStr 
{
    public static String work(String words)
    {
        String rev="";
        int len=words.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+words.charAt(i);
        }
        return rev;
    }
}
