import java.util.*;

class QueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(30);
        p.add(10);
        p.add(20);
        System.out.println("PriorityQueue: " + p);
        System.out.println("Peek: " + p.peek());
        System.out.println("Poll: " + p.poll());

        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.addFirst(10);
        d.addLast(20);
        System.out.println("ArrayDeque: " + d);
        System.out.println("First: " + d.peekFirst());
        System.out.println("Last: " + d.peekLast());
    }
}
