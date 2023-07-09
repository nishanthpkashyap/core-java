package in.codersclub.sampleprograms;

import java.util.Scanner;

public class CountWordsDemo 
{
    public static void main(String[] args) 
    {
        String sentence;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        sentence=scanner.nextLine();
        scanner.close();
        System.out.println("The number of words is:\n"+CountWords.counting(sentence));
    }
}
