package in.codersclub.sampleprograms;
import java.util.Scanner;
public class ArithmaticExcepDemo 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int dividend,divisor;
        System.out.println("Enter the Dividend:");
        dividend=scanner.nextInt();
        System.out.println("Enter the Divisor:");
        divisor=scanner.nextInt();
        scanner.close();
        System.out.println("The Quotient is:"+ArithmaticExcep.divide(dividend, divisor));
    }
}
