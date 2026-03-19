package JAP82.Collection.LinkHashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class IterateLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(1, 2, 3));

        for (int i : set) {
            System.out.println(i);
        }
    }
}
