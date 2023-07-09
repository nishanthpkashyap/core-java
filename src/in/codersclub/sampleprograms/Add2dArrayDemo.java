package in.codersclub.sampleprograms;
import java.util.Scanner;
public class Add2dArrayDemo 
{
    public static void main(String[] args) 
    {
        int i,j,r,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        r=scanner.nextInt();
        c=scanner.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter the 1st array elements:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=scanner.nextInt();
            }
        }
        int b[][]=new int[r][c];
        System.out.println("Enter the 2nd array elements:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                b[i][j]=scanner.nextInt();
            }
        }
        int s[][]=Add2dArray.add(a,b,r,c);
        System.out.println("The sum matrix is:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(s[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
