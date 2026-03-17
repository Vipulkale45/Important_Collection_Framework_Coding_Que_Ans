//Java program to add an element at first and last position in a LinkedList
package JAP82.Collection.LinkedList;

import java.util.LinkedList;

public class AddElementAtFirstAndLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("B");
        list.add("C");

        list.addFirst("A");
        list.addLast("D");

        System.out.println(list);
    }
}
