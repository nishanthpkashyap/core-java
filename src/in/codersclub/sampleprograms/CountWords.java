package in.codersclub.sampleprograms;

public class CountWords 
{
    public static int counting(String sentence)
    {
        int count = 1;
        for(int i=0;i<sentence.length()-1;i++)
        {
           if((sentence.charAt(i)==' ')&&(sentence.charAt(i+1)!=' '))
            {
                count=count+1;
            }
        }
        return count;
    }
}
