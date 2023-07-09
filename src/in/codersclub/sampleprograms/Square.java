package in.codersclub.sampleprograms;

public class Square
{
    public static int sqr(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+(i*i);
        }
        return sum;
    }
}