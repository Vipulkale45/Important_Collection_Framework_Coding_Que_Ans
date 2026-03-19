package JAP82.Collection.HashSet;

import java.util.*;

public class Diifernce {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(2,3));
        s1.removeAll(s2);
        System.out.println(s1);
    }
}
