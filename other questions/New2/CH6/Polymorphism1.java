class Polymorphism1 {
    public static void main(String[] args) {
        /*
         * A1 a = new A1();
         * B1 b = new B1();
         * C1 c = new C1();
         * a.m1();
         * b.m1();
         * c.m1();
         * A1 a1;
         * a1=a;
         * a1.m1();
         * a1=b;
         * a1.m1();
         * a1=c;
         * a1.m1();
         */
        A1 a = new A1();
        a.m1();
        A1 a1 = new B1();
        a1.m1();
        A1 a2 = new C1();
        a2.m1();
        // C1 c2 = new B1(); //error
    }
}

class A1 {
    void m1() {
        System.out.println("Parent");
    }
}

class B1 extends A1 {
    void m1() {
        System.out.println("Child1");
    }
}

class C1 extends A1 {
    void m1() {
        System.out.println("Child2");
    }
}
