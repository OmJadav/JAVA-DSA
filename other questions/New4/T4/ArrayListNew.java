package T4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNew {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();

        al1.add("world");
        al1.add(10);
        al1.add('X');
        al1.add(1.7);
        al1.add(22.13f);
        al1.add(true);
        al1.add(null);
        System.out.println(al1);
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        al2.add(50);
        System.out.println(al2);
        al2.add(1, 15);
        System.out.println(al2);

        ArrayList<Integer> al3 = new ArrayList<Integer>(al2);
        System.out.println("AL3 : " + al3);

        ArrayList<Integer> al4 = new ArrayList<Integer>(5);
        System.out.println(al4);
        al4.ensureCapacity(12);
        al4.ensureCapacity(3);

        // Collections.max(al1);
        System.out.println(Collections.max(al1));
        System.out.println(Collections.max(al2));

        Collections.reverse(al4);
        System.out.println(al4);
        Collections.sort(al4);
        System.out.println(al4);
        System.out.println(Collections.frequency(al4, 10));

    }
}