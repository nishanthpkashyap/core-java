package in.codersclub.sampleprograms;

public class FindOdd 
{
    public static int find(int a[],int n)
    {
        int num=0;
        for(int i=0;i<n;i++)
        {
            if((a[i]%2)!=0)
                num++;
        }
        return num;
    }
}
