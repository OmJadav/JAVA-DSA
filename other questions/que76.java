// WAP to swap two numbers without using temporary variable.
public class que76 {
    public static void main(String[] args) {
        int a=35;
        int b=12;

        System.out.println("Before Swap:::");
System.out.println("A: "+a);
System.out.println("B: "+b);
        a=a^b;
        b=a^b;
        a=a^b;

System.out.println("After Swap:::");
    System.out.println("A: "+a);
    System.out.println("B: "+b);
    }
}
