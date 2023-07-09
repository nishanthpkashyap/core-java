package in.codersclub.sampleprograms;
import java.lang.Math;
public class Triangle 
{
    private float a,b,c,s;
    public Triangle(float s1,float s2,float s3)
    {
        a=s1;b=s2;c=s3;
        s=(a+b+c)/2;
    }
    public float peri()
    {
        return (a+b+c);
    }
    public float area()
    {
        float ar = s*(s-a)*(s-b)*(s-c);
        return (float)(Math.sqrt(ar));
    }
}
