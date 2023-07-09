package in.codersclub.sampleprograms;

import java.util.Scanner;

public class RevStrDemo 
{
    public static void main(String[] args) 
    {
        String words;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        words=scanner.next();
        scanner.close();
        System.out.println("Reversed String is:\n"+RevStr.work(words));
    }

}
