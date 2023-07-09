package in.codersclub.oops;
/*if no class is public then the .java can have any name*/

abstract class Test
{
    public abstract void m1();
    public abstract void m2();
}
class SubTest extends Test
{
    public void m1(){}
    public void m2(){}   /*if we implementaion of m2() is not available in SubTest then first we declare SubTest as abstract and provide implementation for m2() in another child class of Test*/
}
