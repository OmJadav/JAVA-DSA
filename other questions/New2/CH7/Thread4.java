/* wap using multithreading to create 3 threads namely: Alpha, beta, gamma
each thread will print no.s from 1 to 10 along with its name */
//max proprity-10(MAX_PRIORITY) min priority-1(MIN_PRIORITY) normal-(NORM_PRIORITY)
class MT4 extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("i="+i + " "+ (Thread.currentThread().getName()));
        }
    }
}

public class Thread4 {
    public static void main(String[] args) {
        MT4 t1 = new MT4();
        MT4 t2 = new MT4();
        MT4 t3 = new MT4();
        t1.setName("Alpha");
        t2.setName("Beta");
        t3.setName("Gamma");
        //System.out.println(Thread.currentThread().getPriority());
        t1.setPriority(10);
        t2.setPriority(3);
        t3.setPriority(1);
        // System.out.println(t1.getPriority());
        // System.out.println(t2.getPriority());
        // System.out.println(t3.getPriority());
        t1.start();
        t2.start();
        t3.start();
        
    }
}
