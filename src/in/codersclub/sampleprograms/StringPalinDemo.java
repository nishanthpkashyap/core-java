package in.codersclub.sampleprograms;
import java.util.Scanner;
import java.lang.String;
public class StringPalinDemo 
{
    public static void main(String[] args) 
    {
        String words;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        words=scanner.next();
        scanner.close();
        System.out.println(words+StringPalin.crossCheck(words));
    }
}
