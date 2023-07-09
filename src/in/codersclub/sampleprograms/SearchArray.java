package in.codersclub.sampleprograms;

public class SearchArray 
{
    public static String find(int a[],int key,int n)
    {
        String res="is not found";
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                res="is found !!";
            }
        }
        return res;
    }
}
