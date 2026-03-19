package JAP82.Collection.LinkHashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesWhilePreservingOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4);
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        System.out.println(set);
    }
}
