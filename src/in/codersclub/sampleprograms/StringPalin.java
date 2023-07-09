package in.codersclub.sampleprograms;
public class StringPalin 
{
    public static String crossCheck(String words)
    {
        String result;
        int flag=0;
        int len = words.length();
        for(int i=0,j=len-1;i<len;i++,j--)
        {
            if(words.charAt(i)!=words.charAt(j))
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            result=" is a Palindrome";
        }
        else
        {
            result=" is NOT a Palindrome";
        }
        return result;
    }
}
