package in.codersclub.sampleprograms;

import java.lang.Math;
public class RandomOtp 
{
    public static long generate(long min,long max)
    {
        long otp=(long)((Math.random()*(max-min+1))+min);
        return otp;
    }
}
