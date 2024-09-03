//multiple Inheritance & Default method
interface X1{
    default void show(){
        System.out.println("X1 default");
    }
}
interface X2{
    default void show(){
        System.out.println("X2 default");
    }
}
class X3 implements X1,X2{
    public void show(){
        System.out.println("X3 show");
        X1.super.show();
        X2.super.show();
    }
}
public class Interface7 {
    public static void main(String[] args) {
        X3 obj = new X3();
        obj.show();
    }
}
