package in.codersclub.sampleprograms;

import java.util.Scanner;
public class SquareDemo2 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number n:");
        n=scanner.nextInt();
        scanner.close();
        System.out.println("Sum of Squares using formula is:\n"+Square2.findSqr(n)); 
    }
}
