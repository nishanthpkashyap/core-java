package in.codersclub.sampleprograms;
import java.util.Scanner;
public class RepPointDemo 
{
    public static void main(String[] args) 
    {
        int x,y;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the x co-ordinate:");
        x=scanner.nextInt();
        System.out.println("Enter the y co-ordinate:");
        y=scanner.nextInt();
        scanner.close();
        RepPoint obj=new RepPoint(x,y);
        obj.represent();
    }
}
