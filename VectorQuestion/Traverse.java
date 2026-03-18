package JAP82.Collection.VectorQuestion;

import java.util.Enumeration;
import java.util.Vector;

public class Traverse {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("java");
        v.add("Python");
        v.add("c++");

        Enumeration<String> e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
