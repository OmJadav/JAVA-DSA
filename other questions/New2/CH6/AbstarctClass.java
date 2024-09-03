//abstarct class
abstract class A4 {
    int x = 10;

    void show() {
        System.out.println("A Show");
    }
}

class B4 extends A4 {
    void print() {
        System.out.println("B print");
    }
}

public class AbstarctClass {
    public static void main(String[] args) {
        B4 b4 = new B4();
        System.out.println(b4.x);
        // A4 a4 =new A4(); //CE
        A4 a5 = new B4();
        System.out.println(a5.x);
        b4.show();
        b4.print();
        a5.show();
        // a5.print(); //CE
    }
}
