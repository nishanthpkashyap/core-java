package in.codersclub.oops;

public class OverRidingRule3 
{
    public void m1(){m2();}
    void m2(){}
}
class Riding3 extends OverRidingRule3
{
    /*private void m1(){} - cant reduce the scope */
    public void m2(){} /*allowed*/
}
