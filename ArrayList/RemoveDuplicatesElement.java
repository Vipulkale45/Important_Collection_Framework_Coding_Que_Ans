package JAP82.Collection.ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(50);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        System.out.println(uniqueList);
    }
}
