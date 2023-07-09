package in.codersclub.sampleprograms;

import java.util.Date;
import java.text.SimpleDateFormat;
public class CurrentDate 
{
    public static String curDate()
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String mydate = formatter.format(date);
        return mydate;
    }    
}
