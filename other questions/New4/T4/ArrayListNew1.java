import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListNew1 {
    public static void main(String[] args) {
        ArrayList <Integer> al=new ArrayList<>(Arrays.asList(20,10,30,20,40));

        System.out.println(al);

        System.out.println("1st element : "+al.get(0));
        System.out.println("4th element : "+al.get(3));

        al.set(3,70);
        al.add(3,80);

        System.out.println(al);
        System.out.println("70 is present at Index : "+al.indexOf(20));

        // al.remove(50);

        System.out.println("last index of 20 " +al.lastIndexOf(20));

        al.sort(Comparator.naturalOrder());

        System.out.println(al);
        al.sort(Comparator.reverseOrder());



    }
}
