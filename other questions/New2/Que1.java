// Write a java program to explain runtime polymorphism using interfaces
public class Que1 {
    public static void main(String[] args) {
        Animal dog=new Dog();
        Animal cat=new Cat();

        dog.sound();
        cat.sound();
    }
    
}
interface Animal{
    void sound();
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
class Cat implements Animal{
    public void sound(){
        System.out.println("Cat Meows");
    }
}

