package JAP82.Collection.LinkedList;

import java.util.LinkedList;

public class GetFirstAndLastElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
    }
}
