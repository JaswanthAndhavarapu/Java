import java.util.*;

class ListDemo {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        a.add("Java");
        a.add("C");
        System.out.println("ArrayList: " + a);
        System.out.println("Get: " + a.get(0));
        a.remove("C");
        System.out.println("Size: " + a.size());

        LinkedList<String> l = new LinkedList<>();
        l.add("A");
        l.addFirst("Start");
        l.addLast("End");
        System.out.println("LinkedList: " + l);
        System.out.println("First: " + l.getFirst());

        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        System.out.println("Vector: " + v);
        System.out.println("Size: " + v.size());
    }
}
