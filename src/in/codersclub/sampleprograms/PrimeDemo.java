package in.codersclub.sampleprograms;

import java.util.Scanner;
public class PrimeDemo
{
    public static void main(String[] args) 
    {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if its Prime or not :");
        num=scanner.nextInt();
        scanner.close();
        System.out.println(num+Prime.check(num));
    }
} 