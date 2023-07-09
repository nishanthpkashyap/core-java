package in.codersclub.sampleprograms;

public class Gcd 
{
    public static int find(int a,int b)
    {
        if(a==0)
            return b;
        return find((b%a),a);
    }   
}
