class CodeDeveloper extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("function-"+i);
        }
    }
}
class DocumentWriter extends Thread{
    public void run(){
        for (int i = 1; i <= 50; i++) {
            System.out.println("page "+i + " prepared");
        }
    }
}
class Presentor extends Thread{
    public void run(){
        for (int i = 1; i <= 7; i++) {
            System.out.println("slide-"+i);
        }
    }
}
public class Task1 {
    public static void main(String[] args) {
        CodeDeveloper cd1 = new CodeDeveloper();
        cd1.start();
        DocumentWriter d1 = new DocumentWriter();
        d1.start();
        Presentor p1 = new Presentor();
        p1.start();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Main:"+i);
        }
    }
}
