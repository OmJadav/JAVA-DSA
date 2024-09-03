//thread class constructor, calling run method & overloading of start method
class ChildThread1 implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i +" "+Thread.currentThread());
        }
    }
    public void start(){
        System.out.println("thread created");
        run();
    }
}
public class Thread5 {
    public static void main(String[] args) {
        ChildThread1 ct1 = new ChildThread1();
        ct1.start();
    }
}
