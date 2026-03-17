package JAP82.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(50);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
