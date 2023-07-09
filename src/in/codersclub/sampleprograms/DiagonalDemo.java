package in.codersclub.sampleprograms;
import java.util.Scanner;
public class DiagonalDemo 
{
    public static void main(String[] args) 
    {
        int s,i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of square matrix:");
        s=scanner.nextInt();
        int a[][]=new int[s][s];
        System.out.println("Enter the matrix:");
        for(i=0;i<s;i++)
            for(j=0;j<s;j++)
                a[i][j]=scanner.nextInt();
        scanner.close();
        int b[]=Diagonal.sum(a,s);
        System.out.println("The principal diag sum is:\n"+b[0]);
        System.out.println("The secondary diag sum is:\n"+b[1]);
    }
}
