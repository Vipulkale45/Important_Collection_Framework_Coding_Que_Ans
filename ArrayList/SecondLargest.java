package JAP82.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Collections.sort(list);
        System.out.println("Second Largest: " + list.get(list.size()-2));
    }
}
