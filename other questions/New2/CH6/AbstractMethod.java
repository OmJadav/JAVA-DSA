abstract class A5{
    abstract void show();
    abstract void print();
}
class B5 extends A5{
    void show(){
        System.out.println("class-B show method");
    }
    void print(){
        System.out.println("class-B print method");
    }
}
abstract class C5 extends A5{
    public void show(){
        System.out.println("class-C show method");
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
        B5 b5 = new B5();
        b5.show();
    }
}
