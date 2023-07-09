package in.codersclub.sampleprograms;

public class RepPoint 
{
    private int x,y;
    public RepPoint(int a,int b)
    {
        x=a;
        y=b;
    }
    public void represent()
    {
        System.out.println("The Point P in 2D is:");
        System.out.println("P("+x+","+y+")");
    }
}
