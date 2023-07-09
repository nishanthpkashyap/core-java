package in.codersclub.sampleprograms;

import java.util.Scanner;

public class StringPresentDemo 
{
    public static void main(String[] args) 
    {
        String str , pattern;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        str=scanner.nextLine();
        System.out.println("Enter the pattern:");
        pattern=scanner.nextLine();
        scanner.close();
        System.out.println("The pattern '"+pattern+"' "+StringPresent.search(str,pattern)+" in the String '"+str+"'");
    }
}
