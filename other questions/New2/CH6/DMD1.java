//with dataMembers
public class DMD1 {
    public static void main(String[] args) {
        A2 a = new A2();
        System.out.println(a.x);// 10
        a.show();// 10
        A2 a1 = new B2();
        System.out.println(a1.x);// 10
        a1.show();// 20
        // System.out.println(a1.j); //CE
        A2 a2 = new C2();
        System.out.println(a2.x);// 10
        a2.show();// 30
        // System.out.println(a1.i); //CE
    }
}

class A2 {
    int x = 10;

    void show() {
        System.out.println(x + "A");
    }
}

class B2 extends A2 {
    int j = 5;
    int x = 20;

    void show() {
        System.out.println(x + "B");
    }
}

class C2 extends A2 {
    int i = 6;
    int x = 30;

    void show() {
        System.out.println(x + "C");
    }
}
