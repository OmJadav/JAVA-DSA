class PrintSmall extends Thread {
    char ch = 'a';

    public void run() {
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

class PrintCaps extends Thread {
    char ch = 'A';

    public void run() {
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
