package JAP82.Collection.LinkedList;


import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(30);
        list.add(4);

        Collections.reverse(list);
        System.out.println(list);
    }
}
