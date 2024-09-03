import java.util.*;
class BankAccount{
    int accno;
    double balance;
    BankAccount(int a,double b){
        accno = a;
        balance = b;
    }
    synchronized void withdraw(double amt){
        if (balance>=amt) {
            System.out.println("withdraw initialted");
            balance=balance-amt;
            System.out.println("withdraw Successful");
            System.out.println("New balance:"+balance);
        }else{
            System.out.println("withdraw notpossible");
        }
    }
}
class Person1 extends Thread{
    BankAccount b;
    Scanner sc = new Scanner(System.in);
    Person1(BankAccount b){
        this.b=b;
    }
    public void run(){
      /*
        System.out.print("Enter amount to withdraw:");
        int ip = sc.nextInt();
        b.withdraw(ip);
      */
      b.withdraw(5000);
    }
}
public class Sync1 {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(101, 100000);
        Person1 p1 = new Person1(obj);
        Person1 p2 = new Person1(obj);
        p1.start();
        p2.start();
    }
}
