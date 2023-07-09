package in.codersclub.sampleprograms;

import java.util.Scanner;

public class countBothDemo 
{
    public static void main(String[] args) 
    {
        String sentence;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Paragraph:");
        sentence=scanner.nextLine();
        scanner.close();
        int array[]=countBoth.func(sentence);
        System.out.println("No of words:"+array[0]);
        System.out.println("No of sentences:"+array[1]);

    }
}
