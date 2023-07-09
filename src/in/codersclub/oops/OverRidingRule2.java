package in.codersclub.oops;

public abstract class OverRidingRule2 
{
    private void m6(){}

    public final void m1(){m6();}

    public void m2(){}

    public abstract void m3();

    public void m4(){}

    public abstract void m5();
}
abstract class Riding2 extends OverRidingRule2
{
    private void m6(){} //allowed but it is not OVERRIDING

    /*public void m1(){}  -  is not allowed*/

    public final void m2(){m6();} //allowed

    public void m3(){} //allowed

    public abstract void m4(); //allowed

    public abstract void m5(); //allowed
}