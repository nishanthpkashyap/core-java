package in.codersclub.sampleprograms;
import java.util.Scanner;
public class MatrixSumEleDemo 
{
    public static void main(String[] args) 
    {
        int i,j,r,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row and column of matrix:");
        r=scanner.nextInt();
        c=scanner.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter the matrix:");
        for(i=0;i<r;i++)
            for(j=0;j<c;j++)
                a[i][j]=scanner.nextInt();
        scanner.close();
        System.out.println("The sum of elements is:\n"+MatrixSumEle.sum(a,r,c));
    }
}
