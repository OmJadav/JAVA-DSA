// WAP to swap two numbers using temporary variable
public class que75 {
 public static void main(String[] args) {
    int a=35;
    int b=12;

System.out.println("Before Swap:::");
System.out.println("A: "+a);
System.out.println("B: "+b);

int temp;
temp=a;
a=b;
b=temp;
System.out.println("After Swap:::");
    System.out.println("A: "+a);
    System.out.println("B: "+b);
 }   
}
