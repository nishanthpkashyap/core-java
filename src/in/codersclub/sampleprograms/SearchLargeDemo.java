package in.codersclub.sampleprograms;
import java.util.Scanner;
public class SearchLargeDemo 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
            a[i]=scanner.nextInt();
        scanner.close();
        System.out.println("Largest Element is :\n"+SearchLarge.find(a, n));
    }
}
