import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> a = new ArrayList<>();
        a.add("Java");
        a.add("Python");
        a.add(1, "C++");
        System.out.println("ArrayList: " + a);
        System.out.println("Get: " + a.get(1));
        a.set(1, "C");
        System.out.println("Set: " + a);
        System.out.println("Contains Java: " + a.contains("Java"));
        System.out.println("Size: " + a.size());
        System.out.println("Index of Java: " + a.indexOf("Java"));
        a.remove("C++");
        System.out.println("After remove: " + a);

        // LinkedList
        LinkedList<String> l = new LinkedList<>();
        l.add("A");
        l.add("B");
        l.addFirst("Start");
        l.addLast("End");
        System.out.println("\nLinkedList: " + l);
        System.out.println("First: " + l.getFirst());
        System.out.println("Last: " + l.getLast());
        l.removeFirst();
        l.removeLast();
        System.out.println("After remove: " + l);
        l.offer("C");
        System.out.println("Poll: " + l.poll());
        System.out.println("Peek: " + l.peek());

        // Vector
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.addElement(20);
        v.add(30);
        System.out.println("\nVector: " + v);
        System.out.println("Get: " + v.get(1));
        v.set(1, 25);
        v.remove(0);
        System.out.println("After changes: " + v);
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
        System.out.println("Contains 25: " + v.contains(25));
    }
}
