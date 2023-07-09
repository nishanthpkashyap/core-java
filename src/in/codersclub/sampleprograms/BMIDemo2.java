package in.codersclub.sampleprograms;
import java.util.Scanner;
public class BMIDemo2 
{
    public static void main(String[] args) 
    {
        float height , weight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight(kg):");
        weight=scanner.nextFloat();
        System.out.println("Enter your height(m):");
        height=scanner.nextFloat();
        scanner.close();
        float bmi=BMI2.calc(height,weight);
        System.out.println("BMI is - "+bmi+"kg/m^2");
        System.out.println("CONDITION:");
        String result=BMI2.cases(bmi);
        System.out.println(result);
    }
}
