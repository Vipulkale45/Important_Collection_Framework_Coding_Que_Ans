package JAP82.Collection.HashSet;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,4,1,2};
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) set.add(i);
        System.out.println(set);
    }
}
