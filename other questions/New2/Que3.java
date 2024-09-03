// Create class Fruit with method void display(). Create subclasses Apple and Banana that 
// overrides display(). In main method kindly show the concept of Dynamic method dispatch by 
// creating reference of Fruit and object of Apple and Banana respectively and call display(). 

public class Que3 {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit banana = new Banana();
        apple.display();
        banana.display();
    }
}

class Fruit {
    void display() {
        System.out.println("Fruits ");
    }
}

class Apple extends Fruit {
    void display() {
        System.out.println("Apple");
    }
}

class Banana extends Fruit {
    void display() {
        System.out.println("Banana");
    }
}