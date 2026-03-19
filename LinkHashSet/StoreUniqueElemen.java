package JAP82.Collection.LinkHashSet;

import java.util.LinkedHashSet;

public class StoreUniqueElemen {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set);
    }
}
