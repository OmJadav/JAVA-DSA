
// WAP to perform addition, multiplication, subtraction and division according to 
// user choice using else if ladder.

import java.util.Scanner;

public class que118 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2=sc.nextInt();
        System.out.println("Choose operation to be perform:(+/-/*//): ");
        char op=sc.next().charAt(0);

        if(op=='+'){
            System.out.println(num1+num2); 
        }else if(op=='-'){
           System.out.println(num1-num2); 
        
        }else if(op=='*'){
            System.out.println(num1*num2); }
        else if(op=='/'){System.out.println(num1/num2); }
        sc.close();
    }
}
