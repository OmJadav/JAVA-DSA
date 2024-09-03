interface Vehicle{
    int engineCapacity = 100;
    void start();
    void run();
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("engine capacity="+ engineCapacity);
        System.out.println("Kick Start!!");
    }
    public void run(){
        //engineCapacity=50;    //error can't change variables
        System.out.println("Bike running");
    }
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Cell Start!!");
    }
    public void run(){
        System.out.println("Car running");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        Vehicle v1; 
        v1 = new Bike();
        v1.start();
        v1.run();
        v1 = new Car();
        v1.start();
        v1.run();
    }
}
