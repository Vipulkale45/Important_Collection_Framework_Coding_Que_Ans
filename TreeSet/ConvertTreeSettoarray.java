package JAP82.Collection.TreeSet;

import java.util.Arrays;
import java.util.TreeSet;

public class ConvertTreeSettoarray {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(1,2,3));

        Object[] arr = set.toArray();

        System.out.println(Arrays.toString(arr));
    }
}
