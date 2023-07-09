package in.codersclub.sampleprograms;

public class RandomOtpDemo 
{
    public static void main(String[] args) 
    {
        long min=100000,max=999999;
        long otp=RandomOtp.generate(min,max);
        System.out.println("The Random Generated Otp is : \n"+otp);
    }
}
