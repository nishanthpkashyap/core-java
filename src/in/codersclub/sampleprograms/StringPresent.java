package in.codersclub.sampleprograms;

public class StringPresent 
{
    public static String search(String str,String pat)
    {
        int l=str.length();
        int p=pat.length();
        int i=0,j=0;
        while(i<l)
        {
            if(j<p)
            {
                if(str.charAt(i)==pat.charAt(j))
                {
                    i++;j++;
                }
                else
                {
                    i++;
                }
            }
            else
            {
                break;
            }
            
        }
        if(j==p)
        {
            return ("present");
        }
        else
        {
            return ("not present");
        }
    }
}
