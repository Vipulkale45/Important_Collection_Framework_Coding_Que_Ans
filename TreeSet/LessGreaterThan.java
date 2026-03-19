package JAP82.Collection.TreeSet;

import java.util.Arrays;
import java.util.TreeSet;

public class LessGreaterThan {
    public static void main(String[] args) {
         TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10,20,30,40));

        System.out.println(set.headSet(30));
        System.out.println(set.tailSet(30));
    }
}
