package JAP82.Collection.TreeSet;

import java.util.Arrays;
import java.util.TreeSet;

public class Checksubset {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(1,2,3,4));

        System.out.println(set.containsAll(Arrays.asList(2,3)));
    }
}
