package in.codersclub.sampleprograms;

import java.util.*;
public class GcdDemo 
{
    public static void main(String args[])
    {
    int a,b,gcd;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the 2 numbers whose gcd you want to find:");
    a=scanner.nextInt();
    b=scanner.nextInt();
    scanner.close();
    gcd=Gcd.find(a,b);
    System.out.println("GCD of "+a+" and "+b+" is: "+gcd);
    }
}
