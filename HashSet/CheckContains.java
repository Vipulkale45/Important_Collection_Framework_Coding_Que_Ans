package JAP82.Collection.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class CheckContains {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30));
        System.out.println(set.contains(20));
    }
}
