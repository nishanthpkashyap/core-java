package in.codersclub.sampleprograms;

public class Employee 
{
    private String empid,name,mob,gender,emailid;
    public Employee(String emp,String n,String m,String g,String email)
    {
        empid=emp;
        name=n;
        gender=g;
        mob = m;
        emailid=email;
    }
    public void display()
    {
        System.out.println("Employee's  Details are:");
        System.out.println(empid+" "+name+" "+gender+" "+mob+" "+emailid);
    }
}
