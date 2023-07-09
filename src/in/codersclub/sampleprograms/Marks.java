package in.codersclub.sampleprograms;

public class Marks 
{
    public static String tell(int marks)
    {
        String result;
        if(marks>70)
            result="FIRST CLASS WITH DISTINCTION (FCD)";
        else if(marks>60&&marks<=70)
            result="FIRST CLASS (FC)";
        else if(marks>50&&marks<=60)
            result="SECOND CLASS (SC)";
        else if(marks>=35&&marks<=50)
            result="PASS";
        else 
            result="FAIL";
        return result;
    }
}
