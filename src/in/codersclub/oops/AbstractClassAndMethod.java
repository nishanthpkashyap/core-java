package in.codersclub.oops;

public abstract class AbstractClassAndMethod 
{
    public abstract double getInterestRate(); /*Declare method as abstract if you dont know about its implementation*/
    /*child class implements abstract method declared in parent class*/
}
abstract class NoObject
{
    public void m1(){}
    public void m2(){} /*no abstract method still we can have the class as abstract if we think no object should be created*/
}