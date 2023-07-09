package in.codersclub.sampleprograms;

import java.util.Scanner;
public class SummationDemo 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number whose iterative sum you want to find:");
        n=scanner.nextInt();
        scanner.close();
        System.out.println("Iterative sum is :\n"+Summation.sum(n)); 
    }
    
}
