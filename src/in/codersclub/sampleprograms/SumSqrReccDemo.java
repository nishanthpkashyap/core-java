package in.codersclub.sampleprograms;
import java.util.Scanner;
public class SumSqrReccDemo 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number n:");
        n=scanner.nextInt();
        scanner.close();
        System.out.println("The sum of squares are:\n"+SumSqrRecc.sum(n));
    }
}
