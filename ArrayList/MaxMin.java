package JAP82.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(50);
        list.add(200);
        list.add(20);

        System.out.println("Maximun: " + Collections.max(list));
        System.out.println("Minimun " + Collections.min(list));
    }
}
