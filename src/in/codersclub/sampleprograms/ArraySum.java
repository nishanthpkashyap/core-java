package in.codersclub.sampleprograms;

public class ArraySum 
{
    public static int addIt(int a[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        return sum;
    }
}
