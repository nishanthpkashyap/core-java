package in.codersclub.oops;

abstract class Vehicle
{
    public abstract int getNoOfWheels();
}
class Bus extends Vehicle
{
    public int getNoOfWheels()
    {
        return 6;
    }
}
class Auto extends Vehicle
{
    public int getNoOfWheels()
    {
        return 3;
    }
}
class DemoRun
{
    public static void main(String[] args) 
    {
        Bus b = new Bus();
        System.out.println("Bus has "+b.getNoOfWheels()+" wheels");
        Auto a = new Auto();
        System.out.println("Auto has "+a.getNoOfWheels()+" wheels");
    }
}