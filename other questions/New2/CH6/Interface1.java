interface T1{
    void m1();
}
class C4 implements T1{
    public void m1(){
        System.out.println("c1 m1");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        C4 c =new C4();
        c.m1();
    }
}
