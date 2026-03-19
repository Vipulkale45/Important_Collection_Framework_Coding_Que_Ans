package JAP82.Collection.TreeSet;

import java.util.*;

public class FirstAndLastElement {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10,20,30));
        System.out.println(set.first());
        System.out.println(set.last());
    }
}
