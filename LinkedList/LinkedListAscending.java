package JAP82.Collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListAscending {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(40);
        list.add(10);
        list.add(60);
        list.add(20);

        Collections.sort(list);
        System.out.println(list);
    }
}
