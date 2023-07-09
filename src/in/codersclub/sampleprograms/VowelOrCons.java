package in.codersclub.sampleprograms;

public class VowelOrCons 
{
    public static String determine(char letter)
    {
        String result;
        if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
        {
            result =" is a Vowel ";
        }
        else 
        {
            result=" is a consonent";
        }
        return result;
    }
}
