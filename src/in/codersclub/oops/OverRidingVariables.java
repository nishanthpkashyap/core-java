package in.codersclub.oops;

public class OverRidingVariables 
{
    String s="PARENT";
}
class OverRide extends OverRidingVariables
{
    String s="CHILD";
}
class Variables
{
    public static void main(String[] args) 
    {
        OverRidingVariables p=new OverRidingVariables();
        System.out.println(p.s);

        OverRide c = new OverRide();
        System.out.println(c.s);

        OverRidingVariables p1= new OverRide();
        System.out.println(p1.s);
    }
}