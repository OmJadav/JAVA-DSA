
// Write a JAVA program read in an array of integers and print its elements in 
// reverse order.

import java.util.Scanner;

public class que239 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter array elements::");
            arr[i]=sc.nextInt();
        }
        System.out.println("Ok order::");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("reverse order::");
        for(int i=n-1;i>=0;i--){
            System.out.print(" "+arr[i]);
        }
        sc.close();
    }
}
