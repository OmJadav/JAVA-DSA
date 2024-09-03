public class DownCasting1 {
    public static void main(String[] args) {
        Parent2 p1 = new Child2();
        p1.name = "Anil";
        // p1.age=0;
        p1.show();
        System.out.println(p1.name);
        Child2 c1 = (Child2) p1;
        c1.age = 18;
        c1.show();
        System.out.println(c1.name);
    }
}

class Parent2 {
    String name;

    void show() {
        System.out.println("Parent " + name);
    }
}

class Child2 extends Parent2 {
    int age;

    void show() {
        System.out.println("Child " + age);
    }
}
