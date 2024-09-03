class PrintLetters extends Thread{
    char ch = 'A';
    public void run(){
       for (int i = 0; i <= 15; i++) {
        System.out.println(ch);
        ch++;
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
       }
    }
}
public class Sleep1 {
    public static void main(String[] args) {
        PrintLetters p1 = new PrintLetters();
        p1.start();
        try {
            Thread.sleep(2000);
            //Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }System.out.println("Main thread after 5 sec");
    }
}
