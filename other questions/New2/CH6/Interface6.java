//static method - can't override static method in interface
interface I4{
    static void m5(){
        System.out.println("M5");
    }
}
class C8 implements I4{
    void m6(){
        I4.m5();  //for accessing static method
    }
}
public class Interface6 {
    public static void main(String[] args) {
        C8 obj = new C8();
        obj.m6();
        I4.m5();
    }
}
