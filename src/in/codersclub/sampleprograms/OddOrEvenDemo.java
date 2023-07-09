package in.codersclub.sampleprograms;

import java.util.Scanner;
public class OddOrEvenDemo 
{
    public static void main(String[] args) 
    {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to check if it odd or even:");
        a=scanner.nextInt();
        scanner.close();
        System.out.println(a+" is "+OddOrEven.calc(a)); 
    }
}
