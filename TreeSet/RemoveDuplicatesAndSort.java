package JAP82.Collection.TreeSet;

import java.util.TreeSet;

public class RemoveDuplicatesAndSort {
    public static void main(String[] args) {
        int[] arr = {31,2,5,1,5,1};
        TreeSet<Integer> set = new TreeSet<>();
        for(int i: arr) set.add(i);
        System.out.println(set);
    }
}
