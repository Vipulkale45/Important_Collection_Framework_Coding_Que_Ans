package JAP82.Collection.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class CovertLinkedListTOArrayList {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();

        link.add("java");
        link.add("Python");
        link.add("js");

        ArrayList<String> array = new ArrayList<>(link);
        System.out.println(array);
    }
}
