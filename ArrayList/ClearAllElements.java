package JAP82.Collection.ArrayList;

import java.util.ArrayList;

public class ClearAllElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.clear();

        System.out.println(list);
    }
}
