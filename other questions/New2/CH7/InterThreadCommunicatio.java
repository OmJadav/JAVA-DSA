import java.util.*;
class BankAccount1{
    int accno;
    double balance;
    BankAccount1(int a,double b){
        accno = a;
        balance = b;
    }
    synchronized void deposite(double amt){
        System.out.println("Deposite Initiated" +balance);
        System.out.println("Old balance is: "+balance);
        balance=balance+amt;
        System.out.println("New balance:"+balance);
        System.out.println("deposite Successful");
    }
    synchronized void withdraw(double amt){
        if (balance>=amt) {
            System.out.println("withdraw initialted" + balance);
            balance=balance-amt;
            System.out.println("withdraw Successful");
            System.out.println("New balance:"+balance);
        }else{
            System.out.println("withdraw notpossible");
        }
    }
}
class Person_depositor extends Thread{
    BankAccount1 b;
    Scanner sc = new Scanner(System.in);
    Person_depositor(BankAccount1 b){
        this.b=b;
    }
    public void run(){
        System.out.print("Enter amount to deposite:");
        int ip = sc.nextInt();
        b.deposite(ip);
    }
}
class Person_withdrawer extends Thread{
    BankAccount1 b;
    Scanner sc = new Scanner(System.in);
    Person_withdrawer(BankAccount1 b){
        this.b=b;
    }
    public void run(){
        System.out.print("Enter amount to withdraw:");
        int ip = sc.nextInt();
        b.withdraw(ip);
    }
}
public class InterThreadCommunicatio {
    public static void main(String[] args) {
        BankAccount1 b1 = new BankAccount1(101, 100000);
        Person_depositor p1 = new Person_depositor(b1);
        Person_withdrawer p2 = new Person_withdrawer(b1);
        p1.start();
        p2.start();
    }
}
