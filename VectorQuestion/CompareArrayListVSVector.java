package JAP82.Collection.VectorQuestion;

import java.util.ArrayList;
import java.util.Vector;

public class CompareArrayListVSVector {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Vector <Integer> v = new Vector<>();

        al.add(1);
        v.add(1);

        System.out.println("ArrayList :  + " + al);
        System.out.println("Vector :  + " + v);
    }
}
