package in.codersclub.sampleprograms;
public class Factorial 
{   
    public static int find(int n)
    {
        int fact=1;
        for(int i=n;i>0;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
    
}
