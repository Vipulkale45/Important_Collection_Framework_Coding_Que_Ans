//Compare HashSet vs LinkedHashSet
package JAP82.Collection.LinkHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Compare {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(3,1,2));
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Arrays.asList(3,1,2));

        System.out.println("HashSet: " + hs);
        System.out.println("LinkedHashSet: " + lhs);
    }
}
