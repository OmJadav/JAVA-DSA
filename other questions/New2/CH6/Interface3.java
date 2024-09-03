public class Interface3 {
    public static void main(String[] args) {
        C7 c = new C7();
        // c.m3();
        c.m4();
    }
}

interface I3 {
    void m3();

    void m4();
}

abstract class C6 implements I3 {
    public void m3() {
        System.out.println("C5 I3");
    }
}

class C7 extends C6 {
    public void m4() {
        System.out.println("C6 C5");
    }
}
