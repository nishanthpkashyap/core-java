package in.codersclub.sampleprograms;

public class countBoth 
{
    public static int[] func(String sentence)
    {
        int[] array=new int[2];
        array[0]=1;
        array[1]=0;
        for(int i=0;i<sentence.length()-1;i++)
        {
            if((sentence.charAt(i)==' ')&&(sentence.charAt(i+1)!=' '))
            {
                array[0]=array[0]+1;
            }
            if(((sentence.charAt(i)=='.')&&(sentence.charAt(i+1)!='.'))||(i+1==sentence.length()-1))
            {
                array[1]=array[1]+1;
            }
        }
        return array;
    }
}    

