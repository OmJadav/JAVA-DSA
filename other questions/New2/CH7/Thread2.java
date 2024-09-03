class MyThread1 implements Runnable{
    public void run(){
        for (int i = 0; i <= 20; i++) {
            System.out.println("Child:"+i);
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        Thread t = new Thread(mt1);
        t.start();
    }
}
