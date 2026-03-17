package JAP82.Collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDescendingOrder {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(50);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
