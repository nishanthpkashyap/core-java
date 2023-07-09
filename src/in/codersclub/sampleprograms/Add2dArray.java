package in.codersclub.sampleprograms;

public class Add2dArray 
{
    public static int[][] add(int a[][],int b[][],int r,int c)
    {
        int i,j;
        int s[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                s[i][j]=a[i][j]+b[i][j];
            }
        }
        return s;
    }
}
