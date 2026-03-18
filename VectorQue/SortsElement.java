package JAP82.Collection.VectorQue;


import java.util.Collections;
import java.util.Vector;

public class SortsElement {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(7);
        v.add(1);
        v.add(45);

        Collections.sort(v);
        System.out.println("Sorted Vector " + v);
    }
}
