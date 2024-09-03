//wap to create 3 hash set as follows
// 1. odd set that contains odd numbers between 1 to 10 in words
// 2. even set that contains even nubmers between 1 to 10 in words 
// complete set that contain all elements from previous two set 
// print all three set using iterator 

import java.util.*;

public class task3 {
            public static void main(String[] args) {
                HashSet<String> odd = new HashSet<>();
            odd.add("one");
            odd.add("three");
            odd.add("five");
            odd.add("seven");
            odd.add("nine");
            HashSet<String> even = new HashSet<>();
            even.add("two");
            even.add("four");
            even.add("six");
            even.add("eight");
            even.add("ten");

            HashSet<String> all = new HashSet<>();

            all.addAll(even);
            all.addAll(odd);
            System.out.println(all);
            Iterator i = odd.iterator();
            while (i.hasNext()) {
                System.out.println(i.next());
            }
            Iterator k = even.iterator();
            while (k.hasNext()) {
                System.out.println(k.next());
            }
            Iterator l = all.iterator();
            while (l.hasNext()) {
                System.out.println(l.next());
            }
        }

}
