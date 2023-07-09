package in.codersclub.oops;

/*
RULES TO REMEMBER :
1).java file may conatain any number of classes
2).java must contain utmost 1 public class
3)name of the .java file must be same as the name of the public class 
4)if the .java file doesnt contain a public class then its name can be anything 
5)if executing a .class file(when .java is compiled each class in it will get a .class file)it starts executing from the main() method ,so if it doesnt one error will be shown
*/

class A
{
    public static void main(String[] args) 
    {
        System.out.println("A class");
        B.main();
    }
}
class B
{
    public static void main() 
    {
        System.out.println("B class");
    }
}
class C
{
    public static void main(String[] args) 
    {
        System.out.println("C class");
    }
}
class D
{
    /*public static void main(String[] args) 
    {
        System.out.println("D class");
    }*/
}