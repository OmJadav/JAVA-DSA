import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Ex1 {
    public static void main(String[] args) {
        // List <> l1=new ArrayList<>();
        List <Integer> l1=new ArrayList<>();
        List <Integer> l2=new ArrayList<Integer>();
        List <Integer> l3=new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        System.out.println("L1 : " +l1);
        l2.add(50);
        l2.add(60);
        l2.add(70);
        l2.add(80);
        System.out.println("L2 : " +l2);
        l1.addAll(l2);
        l3.add(90);
        l3.add(100);
        System.out.println("L3 : "+l3);
        l1.addAll(2, l3);
        System.out.println("After Adding : "+l1);

        System.out.println("Use Of clear Method");
        l3.clear();
        System.out.println("L3 : "+l3);
        System.out.println("After Clearing : "+l1);
        System.out.println("l1 contains 100 : "+l2.contains(100));


        System.out.println("l2 is Empty : "+l2.isEmpty());
        System.out.println("l3 is Empty : "+l3.isEmpty());

        System.out.println("before removing index 3 : "+l1);
        l1.remove(3);    
        System.out.println("After removing index 3 : "+l1);

        System.out.println("Remove All");
        l1.removeAll(l2);
        // System.out.println(l1.removeAll(l2));
        System.out.println("After Removing All : "+l1);

        Object[] obj= l1.toArray();
        // for(int i=0;i<obj.length;i++){
        //     System.out.println(obj[i]);
        // }

            // forEach 
        for(Object x:obj){
            System.out.println(x);
        }

        System.out.println("--------Print using Iterator");
        Iterator i1=l1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
        System.out.println(l1.size());
}
    
}