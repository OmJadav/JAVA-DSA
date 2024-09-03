import java.util.*;
public class Dequeue12 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(30);
        al.add(20);
        al.add(10);
        al.add(40);
        System.out.println("Array List:"+al);

        ArrayDeque <Integer> ad=new ArrayDeque<>(al);
        ad.add(10);
        ad.offer(13);
        ad.addLast(16);
        System.out.println(ad.peek());
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println(ad.remove());
        System.out.println(ad.remove(10));
        System.out.println("AD : "+ad);
    }
}
