package in.codersclub.sampleprograms;

public class StringOutOfBounds 
{
    public static void show()
    {
        String str="hello";
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(10));
        System.out.println("This wont be printed");
    }
}
