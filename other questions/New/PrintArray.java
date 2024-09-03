import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Array Elements : ");
            a[i]=sc.nextInt();
        }
        System.out.println();
        arrayPrint p=new arrayPrint();
        p.array(a);
    }   
}
class arrayPrint{
    void array(int x[]){
        for(int i=0;i<x.length;i++){
            System.out.println("Array Elements are : "+x[i]);
        }
    }
}
