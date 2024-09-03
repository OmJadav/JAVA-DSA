class A3{
    void print(){
        System.out.println("A");
    }
}
class B3 extends A3{
    void print(){
        System.out.println("B");
    }
}

public class Upcasting1 {
    public static void main(String[] args) {
        A3 a3 = new B3();
        a3.print();
        A3 a1 = (A3)new B3();  //Explicit upcasting
        a1.print();
        //B3 b =new A3();    //CE
        //B3 b3 = (B3)new A3();  //Explicit Downcasting  //CE
        //b3.print();
    }
}
