//thread class constructor, calling run method & overloading of start method-2
class ChildThread2 implements Runnable{
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
public class Thread6 {
    public static void main(String[] args) {
        ChildThread2 ct2 = new ChildThread2();
        Thread t2 = new Thread(ct2);
        t2.start();
    }
}
