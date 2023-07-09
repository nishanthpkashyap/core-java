package in.codersclub.sampleprograms;

public class Diagonal 
{
    public static int[] sum(int a[][],int s)
    {
        int i,j;
        int b[] = new int[2];
        b[0]=b[1]=0;
        for(i=0;i<s;i++)
        {
            for(j=0;j<s;j++)
            {
                if(i==j)
                    b[0]=b[0]+a[i][i];
                
                if(i==(s-j-1))
                    b[1]=b[1]+a[i][j];
            }
        }
        return b;
    }
}
