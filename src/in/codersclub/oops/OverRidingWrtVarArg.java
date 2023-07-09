package in.codersclub.oops;
/*it is actually OVERLOADING not OVERRIDING as arguments are different*/
public class OverRidingWrtVarArg 
{
    public void m1(int... i)
    {
        System.out.println("Parent");
    }
}
class VarArg extends OverRidingWrtVarArg
{
    public void m1(int i)
    {
        System.out.println("Child");
    }
}
class OverloadingNotOverRiding
{
    public static void main(String[] args) 
    {
        OverRidingWrtVarArg p = new OverRidingWrtVarArg();
        p.m1(10);
        VarArg c = new VarArg();
        c.m1(10);
        OverRidingWrtVarArg p1 = new VarArg();
        p1.m1(10);
    }
}
