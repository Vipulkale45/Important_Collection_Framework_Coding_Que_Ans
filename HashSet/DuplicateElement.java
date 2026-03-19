package JAP82.Collection.HashSet;

import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dups = new HashSet<>();
        for (int n : arr) {
            if (!seen.add(n))
                dups.add(n);
        }
        System.out.println(dups); // [2, 3]
    }
}
