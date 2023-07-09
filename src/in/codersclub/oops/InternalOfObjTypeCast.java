package in.codersclub.oops;

public class InternalOfObjTypeCast 
{
    public static void main(String[] args) 
    {
        String s =new String("NIsh");
        Object o = (Object)s;/*for same object we are providing alternate reference variable*/
        System.out.println(s);
        System.out.println(o);
        System.out.println("Are s and o reference variable point to same object:\n"+(s==o));
    }
}
