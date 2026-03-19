package JAP82.Collection.HashSet;

import java.util.*;

public class UnionOfTwoSets {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(23,3));
        s1.addAll(s2);
        System.out.println(s1);
    }
}
