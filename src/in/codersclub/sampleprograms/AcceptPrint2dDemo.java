package in.codersclub.sampleprograms;
import java.util.Scanner;
public class AcceptPrint2dDemo 
{
    public static void main(String[] args) 
    {
        int r,c,i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        r=scanner.nextInt();
        System.out.println("Enter the number of columns:");
        c=scanner.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter the Array elements:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=scanner.nextInt();
            }
        }
        System.out.println("The Array elements are:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
