import java.util.*;



public class Hashmap111 {
    public static void main(String[] args) {
        HashMap <Integer,String > hm=new HashMap<>();
        System.out.println(hm.size());
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        System.out.println(hm.put(4, "FOUR"));
        System.out.println(hm.put(4, "FOUR"));
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.values());


        HashMap <Integer,String > hm2=new HashMap<>();
        hm2.putAll(hm);
        System.out.println(hm2);
        System.out.println(hm.remove(10));
        System.out.println(hm.remove(3));
        System.out.println(hm.remove(2,"one"));
        System.out.println(hm.remove(2,"two"));
        System.out.println(hm.size());
        System.out.println(hm2.size());
        Set s=hm2.entrySet();

        System.out.println(s);
        // Iterator i = s.iterator();
        //     while (i.hasNext()) {
        //         Map.Entry e=(Map.Entry)i.next();
        //         System.out.println(e.getKey()+" = "+e.getValue());
        //     }

            //method-2 

            for(Map.Entry m:hm2.entrySet()){
                System.out.println(m.getKey()+" = "+m.getValue());
            }
    }
}
