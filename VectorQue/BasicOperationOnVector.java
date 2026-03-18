package JAP82.Collection.VectorQue;

import java.util.Vector;

public class BasicOperationOnVector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        //add
        v.add(10);
        v.add(220);
        v.add(230);

        //remove 
        v.remove(1);

        //update
        v.set(0, 50);
        System.out.println(v);
    }
}
