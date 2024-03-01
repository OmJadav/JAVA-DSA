import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int marks[]=new int[5];

        Scanner sc=new Scanner(System.in);

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("SUB 1: "+marks[0]);
        System.out.println("SUB 2: "+marks[1]);
        System.out.println("SUB 3: "+marks[2]);

        System.out.println("length::"+marks.length);
    }
}
