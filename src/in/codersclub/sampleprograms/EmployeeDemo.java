package in.codersclub.sampleprograms;
import java.util.Scanner;
public class EmployeeDemo 
{
    public static void main(String[] args) 
    {
        String empid,name,gen,mob,email;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee's id:");
        empid=scanner.nextLine();
        System.out.println("Enter the employee's name:");
        name=scanner.nextLine();
        System.out.println("Enter the employee's gender:");
        gen=scanner.nextLine();
        System.out.println("Enter the employee's mobile number:");
        mob=scanner.nextLine();
        System.out.println("Enter the employee's email id:");
        email=scanner.nextLine();
        scanner.close();
        Employee emp = new Employee(empid, name,mob, gen, email);
        emp.display();
    }
}
