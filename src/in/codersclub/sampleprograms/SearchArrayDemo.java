package in.codersclub.sampleprograms;
import java.util.Scanner;
public class SearchArrayDemo 
{
    public static void main(String[] args) 
    {
        int n,key;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
            a[i]=scanner.nextInt();
        System.out.println("Enter the element to be searched:");
        key=scanner.nextInt();
        scanner.close();
        System.out.println(key+" "+SearchArray.find(a,key,n));
    }
}
