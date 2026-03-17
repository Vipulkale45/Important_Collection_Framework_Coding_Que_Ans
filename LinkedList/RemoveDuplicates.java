package JAP82.Collection.LinkedList;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        LinkedList<Integer> uniqueList = new LinkedList<>(set);

        System.out.println(uniqueList);
    }
}
