package in.codersclub.sampleprograms;

import java.util.Random;
public class GoogleId 
{
    public static String generate()
    {
        Random rand=new Random();
        char one=(char)(rand.nextInt(26)+'a');
        char two=(char)(rand.nextInt(26)+'a');
        char three=(char)(rand.nextInt(26)+'a');
        char fourth=(char)(rand.nextInt(26)+'a');
        char fifth=(char)(rand.nextInt(26)+'a');
        char sixth=(char)(rand.nextInt(26)+'a');
        char seventh=(char)(rand.nextInt(26)+'a');
        char eight=(char)(rand.nextInt(26)+'a');
        char nineth=(char)(rand.nextInt(26)+'a');
        char tenth=(char)(rand.nextInt(26)+'a');
        System.out.println("The Google meet ID is: ");
        String meetid=(""+one+two+three+"-"+fourth+fifth+sixth+seventh+"-"+eight+nineth+tenth);
        return meetid;
    }
}
