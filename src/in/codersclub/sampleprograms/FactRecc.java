package in.codersclub.sampleprograms;

public class FactRecc 
{
    public static int fact(int n)
    {
        if(n>1)
            return n*fact(n-1);
        else
            return n;
    }
}
