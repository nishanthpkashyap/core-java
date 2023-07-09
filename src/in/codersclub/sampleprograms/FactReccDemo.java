package in.codersclub.sampleprograms;
import java.util.Scanner;
public class FactReccDemo 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        n=scanner.nextInt();
        scanner.close();
        System.out.println("The factorial of "+n+" is:"+"\n"+FactRecc.fact(n));
    }
}
