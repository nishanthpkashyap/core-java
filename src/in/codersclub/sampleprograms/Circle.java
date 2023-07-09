package in.codersclub.sampleprograms;

public class Circle 
{
    private float rad;
    public Circle(float r)
    {
        rad=r;
    }

    public float peri()
    {
        return ((2*22*rad)/7);
    }

    public float area()
    {
        return ((22*rad*rad)/7);
    }
}
