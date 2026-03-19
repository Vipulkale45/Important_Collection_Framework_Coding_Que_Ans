package JAP82.Collection.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ConvertHashSetToArrayList {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,3));
        ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
