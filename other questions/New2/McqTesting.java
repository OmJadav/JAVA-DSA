class McqTesting {
    public static void main(String args[]) {
        LJU lj = new LJU();
        lj.run();
        System.out.println("Hello");
    }
}

class LJU extends Thread {
    public void run() {
        System.out.print("Hi");
    }
}
