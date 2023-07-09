package in.codersclub.sampleprograms;
import java.lang.Math;
public class PointDist 
{
    private int x1,x2,y1,y2;
    public PointDist(int a1,int b1,int a2,int b2)
    {
        x1=a1;
        y1=b1;
        x2=a2;
        y2=b2;
    }
    public double dista()
    {
        double d = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        return d;
    }
}
