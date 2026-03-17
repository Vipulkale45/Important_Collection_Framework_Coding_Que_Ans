package JAP82.Collection.LinkedList;

import java.util.LinkedList;

public class RemoveFirstAndLastElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}
