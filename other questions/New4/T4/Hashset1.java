import java.util.*;
public class Hashset1 {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);
        hs1.add(6);
        hs1.add(7);

        System.out.println(hs1);
        System.out.println(hs1.add(5));
        System.out.println(hs1.size());

        hs1.remove(5);
        System.out.println(hs1);

        System.out.println("Removing element 4::"+hs1.remove(4));
        System.out.println("Removing element 9::"+hs1.remove(9));

        HashSet<Integer> h2=new HashSet<>();
        System.out.println("H2 is empty: "+h2.isEmpty());

        h2.addAll(hs1);
        System.out.println(h2);
        System.out.println(h2.isEmpty());

        HashSet<Integer> h3=new HashSet<>();

        h3.add(6);
        h3.add(7);
        System.out.println(h3);
        System.out.println(h2);
        System.out.println("Adding h2 in h3::");
        h3.addAll(h2);
        System.out.println(h3);
        System.out.println(h3.addAll(h2));;
        h3.add(10);
        h3.add(20);
        h3.add(30);
        System.out.println(h3);
        h3.removeAll(h2);
        System.out.println(h3);
        h2.removeAll(hs1);
        System.out.println(h2);

        System.out.println(hs1.hashCode());
        System.out.println(h2.hashCode());
        System.out.println(h3.hashCode());

        System.out.println("Printing Hashset using iterator");
        Iterator i = hs1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
