package in.codersclub.sampleprograms;

import java.util.Scanner;

public class TriangleDemo 
{
    public static void main(String[] args) 
    {
        float a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 sides of the triangle :");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        scanner.close();
        Triangle obj = new Triangle(a,b,c);
        System.out.println("The perimeter of the triangle is:\n"+obj.peri());
        System.out.println("The area of the triangle is:\n"+obj.area());
    }
}
