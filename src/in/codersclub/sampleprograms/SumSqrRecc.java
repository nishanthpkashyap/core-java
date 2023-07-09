package in.codersclub.sampleprograms;

public class SumSqrRecc 
{
    public static int sum(int n)
    {
        if(n>0)
        {
            return (n*n)+sum(n-1);
        }
        else
            return n;
    }
}
