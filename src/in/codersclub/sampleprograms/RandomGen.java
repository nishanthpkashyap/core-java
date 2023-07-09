package in.codersclub.sampleprograms;

import java.lang.Math;
public class RandomGen
{
    public static int generate(int min,int max)
    {
        int rand;
        rand = (int)((Math.random()*(max-min+1))+min);
        return rand;
    }
}