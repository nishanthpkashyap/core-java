package in.codersclub.oops;

public class ObjTypeCasting3Mantras 
{
    public static void main(String[] args)throws Exception
    {
        /*example 1-all 3 rules passed*/
        Object obj = new String("NIsh");
        String s = (String) obj;
        System.out.println(s);

        try
        {
            /*example 2 - first 2 rules passed but will give exception*/
            Object o=new String("NISH"); /*legal cause child obj and parent reference type*/
            StringBuffer sb=(StringBuffer) o;/*rule 1 passed (o type is parent of StringBuffer ),   rule 2 passed (A and C are sametype i.e. StringBuffer) ,rule 3 is not passed   (runtime obj type of o is String and String is not related to StringBuffer)*/
            System.out.println(sb);
        }
        catch(Exception e)
        {
            System.out.println("Class cast Exception!!!!");
        }

    }
}
