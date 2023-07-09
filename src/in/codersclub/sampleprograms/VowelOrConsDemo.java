package in.codersclub.sampleprograms;
import java.util.Scanner;
public class VowelOrConsDemo 
{
    public static void main(String[] args) 
    {
        char letter;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a letter:");
        letter=scanner.next().charAt(0);
        scanner.close();
        System.out.println(letter+VowelOrCons.determine(letter));
    }
}
