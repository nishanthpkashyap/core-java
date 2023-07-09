package in.codersclub.sampleprograms;

public class InitArrayDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("The Array Elements are:");
        int a[]=InitArray.init();
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
         
    }
}
