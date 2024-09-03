//getting and setting name of thread
class MT3 extends Thread{}
public class Thread3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Original");
        MT3 m3 = new MT3();
        System.out.println(m3.getName());
        m3.setName("First");
        System.out.println(m3.getName());
    }
}
