package in.codersclub.sampleprograms;

import java.util.Scanner;
public class SquareDemo 
{
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter the number n");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        scanner.close();
        System.out.println("Sum of Squares is:\n"+Square.sqr(n)); 
    }
}
