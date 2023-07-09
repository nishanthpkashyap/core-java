package in.codersclub.sampleprograms;

import java.util.Scanner;
public class MarksDemo 
{
    public static void main(String[] args) 
    {
        int marks;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of the student");
        marks = scanner.nextInt();
        scanner.close();
        System.out.println(Marks.tell(marks)); 
    }
}
