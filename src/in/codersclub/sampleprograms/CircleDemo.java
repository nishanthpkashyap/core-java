package in.codersclub.sampleprograms;

import java.util.Scanner;

public class CircleDemo 
{
    public static void main(String[] args) 
    {
        float r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle:");
        r = scanner.nextFloat();
        scanner.close();
        Circle obj = new Circle(r);
        System.out.println("The perimeter of the circle is:\n"+obj.peri());
        System.out.println("The are of the circle is:\n"+obj.area());
    }
}
