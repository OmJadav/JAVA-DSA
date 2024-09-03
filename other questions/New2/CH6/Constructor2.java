abstract class Shape2{
    int x,y;
    Shape2(int x,int y){
        this.x=x;
        this.y=y;
    }
    abstract void area();
    void show(){
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    static void m1(){
        System.out.println("Shape static method");
    }
}
class Rectangle3 extends Shape2{
    int width,height;
    Rectangle3(){
        super(0, 0);
        this.width=5;
        this.height=5;
    }
    Rectangle3(int w, int h){
        super(2, 1);
        this.width=w;
        this.height=h;
    }
    void area(){
        System.out.println("Area of rect is=" + (width*height));
    }
}
public class Constructor2 {
    public static void main(String[] args) {
        Shape2 s1 = new Rectangle3();
        Shape2 s2 = new Rectangle3(10, 20);
        s1.area();
        s2.area();
        Shape2.m1();
    }
}
