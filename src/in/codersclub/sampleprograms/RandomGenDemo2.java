package in.codersclub.sampleprograms;

public class RandomGenDemo2 
{
    public static void main(String[] args) 
    {
        int max=2000,min=1000;
        System.out.println("The 10 Random number between 1000 and 100 is :");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+")."+RandomGen2.generate(min,max));
        }
        
    }
}
