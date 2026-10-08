import java.util.*;

class SetDemo {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        System.out.println("Stack: " + s);
        System.out.println("Pop: " + s.pop());

        HashSet<Integer> h = new HashSet<>();
        h.add(10);
        h.add(20);
        h.add(10);
        System.out.println("HashSet: " + h);

        LinkedHashSet<String> l = new LinkedHashSet<>();
        l.add("Java");
        l.add("C");
        System.out.println("LinkedHashSet: " + l);

        TreeSet<Integer> t = new TreeSet<>();
        t.add(30);
        t.add(10);
        t.add(20);
        System.out.println("TreeSet: " + t);
        System.out.println("First: " + t.first());
        System.out.println("Last: " + t.last());
    }
}
