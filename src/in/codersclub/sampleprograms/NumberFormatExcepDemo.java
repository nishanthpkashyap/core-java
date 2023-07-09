package in.codersclub.sampleprograms;
import java.util.Scanner;
public class NumberFormatExcepDemo 
{
    public static void main(String[] args) 
    {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String (number):");
        str = scanner.nextLine();
        scanner.close();
        System.out.println("String to Integer:\n"+NumberFormatExcep.converter(str));
    }
    
}
