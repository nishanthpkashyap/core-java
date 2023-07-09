package in.codersclub.sampleprograms;
import java.util.Scanner;
public class TimeDiffDemo 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String time1,time2;
        System.out.println("Enter TIME 1 in HH:mm format:");
        time1 = scanner.nextLine();
        System.out.println("Enter TIME 2 in HH:mm format:");
        time2 = scanner.nextLine();
        scanner.close();
        System.out.println("Difference of Time in mins:");
        System.out.println(TimeDiff.calculate(time1, time2)+" mins");
    }
}
