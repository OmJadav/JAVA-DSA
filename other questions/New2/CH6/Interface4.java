//default method
interface I11 {
    void show();

    default void print() {
        System.out.println("Default print method");
    }
}

class C11 implements I11 {
    public void show() {
        System.out.println("Child class show");
    }

    // overRiding
    public void print() {
        System.out.println("Default OverRidden method");
    }
}

class interface4 {
    public static void main(String[] args) {
        I11 obj = new C11();
        obj.show();
        obj.print();
    }
}