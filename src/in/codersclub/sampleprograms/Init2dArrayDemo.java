package in.codersclub.sampleprograms;

public class Init2dArrayDemo 
{
    public static void main(String[] args) 
    {
        int a[][]=Init2dArray.init();
        System.out.println("The elements are:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
