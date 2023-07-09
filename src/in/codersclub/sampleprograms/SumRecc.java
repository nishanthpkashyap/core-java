package in.codersclub.sampleprograms;

public class SumRecc 
{
    public static int sums(int n)
    {
        if(n>0)
        {
            return n+sums(n-1);
        }
        else
            return n; 
    }
}
