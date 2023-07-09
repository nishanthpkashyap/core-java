package in.codersclub.sampleprograms;

import java.lang.Math;
public class Prime 
{   
    
    public static String check(int num)
    {
        int ul,flag;
        String result;
        ul = (int)Math.sqrt(num);
        flag=0;
        for(int i=2;i<=ul;i++)
        {
            if((num%i)==0)
            {
                flag=1;
            }
        }
        if(flag==0)
            result=" is a Prime Number";
        else
            result=" is not a Prime Number";
        return result;
    }
} 