//Write a Java program to reverse an ArrayList.

package JAP82.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(85);
        l.add(4);

        Collections.reverse(l);
        System.out.println(l);
    }
}
