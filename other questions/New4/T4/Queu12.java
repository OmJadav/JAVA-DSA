import java.util.*;
public class Queu12 {

    public static void main(String[] args) {
        Queue q1 = new PriorityQueue();
        System.out.println(q1);
        System.out.println(q1.size());
        q1.offer(12);
        q1.offer(2);
        q1.offer(10);
        System.out.println(q1);
        System.out.println(q1.element());
        q1.offer(9);
        q1.offer(10);
        q1.offer(8);
        q1.offer(18);
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1.element());
        System.out.println(q1.poll());
        System.out.println(q1);
        System.out.println(q1.remove());
        System.out.println(q1);

        PriorityQueue<Integer> pq1=new PriorityQueue<>(q1);

        System.out.println(pq1);
        System.out.println(pq1.size());
        System.out.println(pq1.offer(15));
        System.out.println(pq1.peek());
        System.out.println(pq1);
        Iterator i = pq1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        PriorityQueue<String> p2=new PriorityQueue<>();
        p2.poll();
        // p2.remove();
        PriorityQueue<Integer> p3=new PriorityQueue<>(Comparator.reverseOrder());
        p3.offer(12);
        p3.offer(2);
        p3.offer(10);
        System.out.println(p3);
        p3.offer(9);
        p3.offer(10);
        p3.offer(8);
        p3.offer(18);
        System.out.println(p3);
    }
}