package JAP82.Collection.TreeSet;

import java.util.TreeSet;

public class CustomComparator {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>((a,b) -> b - a);

        set.add(10);
        set.add(20);
        set.add(5);

        System.out.println(set);
    }
}
