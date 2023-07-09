package in.codersclub.sampleprograms;

import java.util.Scanner;
public class GreatestDemo
{
    public static void main(String[] args)
    {
    int a,b,c;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the 1st number:");
    a=scanner.nextInt();
    System.out.println("Enter the 2nd number:");
    b=scanner.nextInt();
    System.out.println("Enter the 3rd number:");
    c=scanner.nextInt();
    scanner.close();
    System.out.println(Greatest.find(a,b,c)+" is Greatest"); 
    }
}

