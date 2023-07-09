package in.codersclub.sampleprograms;

import java.util.Scanner;
public class SummationDemo2 
{
    public static void main(String args[])
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        n=scanner.nextInt();
        scanner.close();
        System.out.println("Sum of numbers using formula is:\n"+Summation2.sum(n)); 
    }
}
