package in.codersclub.oops;
class Base1{}
class Base2{}
class Der1 extends Base1{}
class Der2 extends Base1{}
class Der3 extends Base2{}
class Der4 extends Base2{}

public class ObjTypeCastingCaseStudy 
{
    public static void main(String[] args) 
    {
        Base2 b = new Der4(); //allowed

        Der4 d = (Der4) b;
        System.out.println(d);
        /*Base1 b1 = (Base1) b; - not allowed*/
        Base2 b2 = (Base2) b;
        System.out.println(b2);
        /*Object o = (Der3) b; - not allowed*/
        /*Base2 b3 = (Base1) b; - not allowed*/
    }
}
