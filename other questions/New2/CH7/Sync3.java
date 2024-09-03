//wait & notify in synchronized block/method
class Compute extends Thread {
    int sum = 0;

    public void run() {
        for (int i = 0; i <= 50; i++) {
            sum += i;
        }
        synchronized (this) {
            this.notify();
        }
        /*
         * try {
         * this.notify();
         * } catch (Exception e) {
         * //System.out.println(e.getMessage());
         * }
         */
    }
}

public class Sync3 {
    public static void main(String[] args) throws InterruptedException {
        Compute c1 = new Compute();
        c1.setName("Sum100");
        c1.start();
        synchronized (c1) {
            c1.wait();
        }
        System.out.println("sum=" + c1.sum);
    }
}
