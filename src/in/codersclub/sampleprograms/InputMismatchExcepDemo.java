package in.codersclub.sampleprograms;
import java.util.Scanner;
public class InputMismatchExcepDemo 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        n=scanner.nextInt();
        scanner.close();
        System.out.println("n = "+InputMismatchExcep.assigner(n));
    }
}
