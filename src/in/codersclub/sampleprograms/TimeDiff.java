package in.codersclub.sampleprograms;

public class TimeDiff 
{
    public static int calculate(String time1,String time2)
    {
        String hours1="",hours2="",min1="",min2="";
        hours1 = hours1 + time1.charAt(0) + time1.charAt(1);
        min1 = min1+time1.charAt(3)+time1.charAt(4);
        hours2 = hours2+time2.charAt(0)+time2.charAt(1);
        min2 = min2+time2.charAt(3)+time2.charAt(4);
        int h1=Integer.parseInt(hours1);
        int h2=Integer.parseInt(hours2);
        int m1=Integer.parseInt(min1);
        int m2=Integer.parseInt(min2);
        int hours = h2-h1;
        int min = m2-m1;
        min = min+(hours*60);
        if(min>0)
            return min;
        else
            return ((-1)*min);
    }
}
