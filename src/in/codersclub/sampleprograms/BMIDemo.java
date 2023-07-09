package in.codersclub.sampleprograms;
import java.util.Scanner;
public class BMIDemo 
{
    public static void main(String[] args) 
    {
        float weight,height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight(kg):");
        weight=scanner.nextFloat();
        System.out.println("Enter your height(m):");
        height=scanner.nextFloat();
        scanner.close();
        System.out.println("Body Mass Index (BMI) :"+BMI.calc(weight, height)+"kg/m^2");
    }
}
