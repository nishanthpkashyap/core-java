package in.codersclub.sampleprograms;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class ListDateDemo 
{
    public static void main(String[] args) throws Exception
    {
        String date1,date2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Starting date in yyyy-MM-dd format");
        date1 = scanner.nextLine();
        System.out.println("Enter the ending Date in yyyy-MM-dd format");
        date2 = scanner.nextLine();
        scanner.close();
        Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
        Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(date2);
        System.out.println("The Dates are:");
        ListDate.Difference(d1,d2);
    }
}
