package in.codersclub.sampleprograms;

public class MatrixMul 
{
    public static int[][] mul(int[][] a,int[][] b,int r1,int c1,int r2,int c2)
    {
        int i,j,k;
        int c[][] = new int[r1][c2];
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                c[i][j]=0;
                for(k=0;k<c1;k++)
                {
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }
            }
        }
        return c;
    }
}
