package in.codersclub.sampleprograms;

import java.util.Scanner;
public class SiDemo 
{
    public static void main(String args[]) 
    {
        double time,principle,rate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Principle amount:");
        principle=scanner.nextDouble();
        System.out.println("Enter the time:");
        time=scanner.nextDouble();
        System.out.println("Enter the rate:");
        rate=scanner.nextDouble();
        scanner.close();
        System.out.println("Simple Interest is:\n"+Si.calc(principle,time,rate)); 
    }
}

