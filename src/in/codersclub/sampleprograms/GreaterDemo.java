package in.codersclub.sampleprograms;

import java.util.*;
public class GreaterDemo
{
    public static void main(String[] args) 
    {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of 1st number");
        a=scanner.nextInt();
        System.out.println("Enter the value of 2nd number");
        b=scanner.nextInt();
        scanner.close();
        System.out.println(Greater.find(a,b)+" is Greater"); 
    }
}