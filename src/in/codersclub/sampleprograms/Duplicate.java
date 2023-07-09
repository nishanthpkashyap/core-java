package in.codersclub.sampleprograms;

public class Duplicate 
{
    public static void duplicate(int a[],int n)
    {
        int flag=0;
        System.out.println("The duplicate elements are:");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    flag=1;
                    System.out.println(a[j]);                
                }
            }
        }
        if(flag==0)
            System.out.println("There are no duplicate elements in the given array.");
    }
}
