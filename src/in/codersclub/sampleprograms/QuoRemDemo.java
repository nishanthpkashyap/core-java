package in.codersclub.sampleprograms;
import java.util.Scanner;
public class QuoRemDemo 
{
    public static void main(String[] args)
    {
        int dividend,divisor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        dividend=scanner.nextInt();
        System.out.println("Enter the divisor:");
        divisor=scanner.nextInt();
        scanner.close();
        System.out.println("Remainder is:\n"+QuoRem.calc(dividend,divisor)); 
        System.out.println("Quotient is:\n"+QuoRem.calc2(dividend, divisor));
    }
}
