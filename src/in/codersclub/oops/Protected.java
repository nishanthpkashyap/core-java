package in.codersclub.oops;

public class Protected 
{
    protected void m()
    {
        System.out.println("A class Protected method");
    }
}
class R extends Protected
{
    public static void main(String[] args) 
    {
        Protected p = new Protected();
        p.m();
        R b = new R(); //in this scenario all three will work perfectly
        b.m();
        Protected pr = new Protected();
        pr.m();
        /*but the first and third wont work if child class R is outside the package which contains the parent class*/
    }
}