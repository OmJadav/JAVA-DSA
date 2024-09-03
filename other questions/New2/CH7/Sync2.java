//Synchronized block
class Receiver{
    void receive(){
        System.out.println("Caller id calling:" + Thread.currentThread().getName());
        synchronized (this){
            for (int i = 1; i <= 5; i++) {
                System.out.println("Rinning call..." + i);
            }
            System.out.println("Call is answered..call received");
            System.out.println("Hello");
            System.out.println("Bye");
            System.out.println("Disconnecting Call");
        }
    }
}
class Caller extends Thread{
    Receiver r;
    Caller(Receiver r){
        this.r=r;
    }
    public void run(){
        r.receive();
    }
}
public class Sync2 {
    public static void main(String[] args) {
        Receiver r1 = new Receiver();
        Caller c1 = new Caller(r1);
        Caller c2 = new Caller(r1);
        Caller c3 = new Caller(r1);
        c1.setName("xyz");
        c2.setName("Yzq");
        c3.setName("zzz");
        c1.start();
        c2.start();
        c3.start();
    }
}
