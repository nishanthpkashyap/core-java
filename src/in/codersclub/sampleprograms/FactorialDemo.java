package in.codersclub.sampleprograms;

import java.util.Scanner;
public class FactorialDemo 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number whose factorial you want to find :");
        n=scanner.nextInt();
        scanner.close();
        int fact=Factorial.find(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }   
}
