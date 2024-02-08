import java.util.Scanner;

public class Sum_twoNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sumTwoNum(a, b);
    }

    public static void sumTwoNum(int a,int b){
        int sum=a+b;
        System.out.println("Total Sum is::"+sum);
    }
}