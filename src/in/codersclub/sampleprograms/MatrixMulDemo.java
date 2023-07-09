package in.codersclub.sampleprograms;
import java.util.*;
public class MatrixMulDemo 
{
    public static void main(String[] args) 
    {
        int i,j,r1,c1,r2,c2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row and column for 1st matrix:");
        r1=scanner.nextInt();
        c1=scanner.nextInt();
        System.out.println("Enter the row and column of 2nd matrix:");
        r2=scanner.nextInt();
        c2=scanner.nextInt();
        if(c1!=r2)
        {
            System.out.println("Matrix multiplication not possible!!!");
            System.exit(0);
        }
        int a[][]=new int[r1][c1];
        int b[][] =new int[r2][c2];
        System.out.println("Enter 1st matrix:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter 2nd matrix:");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                b[i][j]=scanner.nextInt();
            }
        }
        scanner.close();
        int c[][]=MatrixMul.mul(a, b, r1, c1, r2, c2);
        System.out.println("The multiplication matrix is:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
