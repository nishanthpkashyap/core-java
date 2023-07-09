package in.codersclub.sampleprograms;

public class MatrixSumEle 
{
    public static int sum(int a[][],int r,int c)
    {
        int sum=0,i,j;
        for(i=0;i<r;i++)
            for(j=0;j<c;j++)
                sum=sum+a[i][j];
        return sum;
    }
}
