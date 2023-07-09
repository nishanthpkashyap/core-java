package in.codersclub.sampleprograms;
public class BMI2 
{
    public static float calc(float height,float weight)
    {
        float bmi = (weight/(height*height));
        return bmi;
    }
    public static String cases(float bmi)
        {
            String result;
            if(bmi<18.5)
                result="UNDER WEIGHT";
            else if(bmi>=18.5 && bmi<25)
                result="NORMAL WEIGHT";
            else if(bmi>=25 && bmi<30)
                result="OVER WEIGHT";
            else
                result="OBESE";
            return result;
        }
}
