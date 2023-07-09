package in.codersclub.sampleprograms;
import java.util.Scanner;
public class FiboReccDemo 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series:");
        n=scanner.nextInt();
        scanner.close();
        for(int i=0;i<n;i++)
        {
            System.out.print(FiboRecc.fib(i)+" ");
        }
    }
}
