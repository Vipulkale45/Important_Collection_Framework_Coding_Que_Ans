package JAP82.Collection.ArrayList;

import java.util.*;

public class SwapTwo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Collections.swap(list, 0, 2);

        System.out.println(list);
    }
}