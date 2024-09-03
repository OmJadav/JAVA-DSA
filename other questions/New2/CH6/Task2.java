//write a program that will prompt user to enter an int.if user enters int correctly display good girl/good boy. if input is other than int show msg incorrect data entered.implement program to show use of try,catch,finally.
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        try {
            int a = sc.nextInt();
            System.out.println("good girl!" + a);
        } catch (Exception e) {
            System.out.println("incorrect data entered");
        }
        finally{
            sc.close();
        }
    }
}

//wap to print sumof numbers given at commandlineargument.