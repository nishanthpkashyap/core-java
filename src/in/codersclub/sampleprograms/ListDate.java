package in.codersclub.sampleprograms;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ListDate 
{
    public static void Difference(Date start,Date end)
    {
        long d1 = start.getTime();
        long d2 = end.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        if(d1<d2)
        {
            for(long i=d1; i<=d2; i+=86400000)
            {
                System.out.println(formatter.format(i));
            }
        }
    }
}
