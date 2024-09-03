class MyThread extends Thread{
    public void run(){
        for (int i = 0; i <= 20; i++) {
            System.out.println("Child:"+i);
        }
    }
}
class Thread1{
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Main:"+i);
        }
    }
}