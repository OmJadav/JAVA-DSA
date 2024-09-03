
public class Constructor1 {
    public static void main(String[] args) {
        Shape1 s1 = new Rectangle2();
        s1.x = 10;
        s1.y = 20;
        s1.setWH();
        s1.area();
        s1.show();
    }
}

abstract class Shape1 {
    int x, y;

    Shape1() {
        x = y = 0;
    }

    abstract void area();

    abstract void setWH();

    void show() {
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }

    static void m1() {
        System.out.println("Shape static method");
    }
}

class Rectangle2 extends Shape1 {
    int width, height;

    void area() {
        System.out.println("Area of rect is=" + (width * height));
    }

    void setWH() {
        width = 100;
        height = 200;
    }
}
