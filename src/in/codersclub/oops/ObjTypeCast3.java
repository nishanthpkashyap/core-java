package in.codersclub.oops;
class P
{
    int n = 999;
} 
class Q extends P
{
    int n = 888;
} 
class O extends Q
{
    int n = 777;
} 
public class ObjTypeCast3 
{
    public static void main(String[] args) 
    {
        O r = new O();
        System.out.println(r.n);
        System.out.println(((Q)r).n);
        System.out.println(((P)((Q)r)).n);
    }
}
