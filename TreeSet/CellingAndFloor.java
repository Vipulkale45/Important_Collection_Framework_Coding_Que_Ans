package JAP82.Collection.TreeSet;

import java.util.Arrays;
import java.util.TreeSet;

public class CellingAndFloor {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10,20,30));

        System.out.println(set.ceiling(15));
        System.out.println(set.floor(15));
    }
}
