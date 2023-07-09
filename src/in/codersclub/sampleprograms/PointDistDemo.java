package in.codersclub.sampleprograms;
import java.util.Scanner;
public class PointDistDemo 
{
    public static void main(String[] args) 
    {
        int x1,y1,x2,y2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x1 co-ordinate:");
        x1=scanner.nextInt();
        System.out.println("Enter the y1 co-ordinate:");
        y1=scanner.nextInt();
        System.out.println("Enter the x2 co-ordinate:");
        x2=scanner.nextInt();
        System.out.println("Enter the y2 co-ordinate:");
        y2=scanner.nextInt();
        scanner.close();
        PointDist obj=new PointDist(x1,y1,x2,y2);
        System.out.println("The Distance is:\n"+obj.dista());   
    }
}
