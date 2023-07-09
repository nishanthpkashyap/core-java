package in.codersclub.sampleprograms;

public class PointQuad 
{
    private int x,y;
    public PointQuad(int a,int b)
    {
        x=a;
        y=b;
    }
    public void whichQuad()
    {
        if(x>=0 && y>=0)
            System.out.println("Point P("+x+","+y+") is in 1st Quadrant");
        else if(x<=0 && y>=0)
            System.out.println("Point P("+x+","+y+") is in 2nd Quadrant");
        else if(x<0 && y<0)
            System.out.println("Point P("+x+","+y+") is in 3rd Quadrant");
        else
            System.out.println("Point P("+x+","+y+") is in 4th Quadrant");
    }
}
