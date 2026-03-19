package JAP82.Collection.TreeSet;

import java.util.Collections;
import java.util.TreeSet;

public class ReverseOrder {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        set.add(10);
        set.add(50);
        set.add(5);
        System.out.println(set);
    }
}
