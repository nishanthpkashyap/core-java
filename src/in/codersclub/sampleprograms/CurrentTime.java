package in.codersclub.sampleprograms;
import java.text.SimpleDateFormat;
import java.util.Date;
public class CurrentTime 
{
    public static String myTime()
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
        String mytime = formatter.format(date);
        return mytime;
    }
}
