package JAP82.Collection.VectorQuestion;

import java.util.Collections;
import java.util.Vector;

public class MaximumMinimum {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(5);
        v.add(15);
        v.add(2);
        v.add(25);

        int max = Collections.max(v);
        int min = Collections.min(v);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
