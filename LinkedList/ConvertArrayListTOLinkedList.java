package JAP82.Collection.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertArrayListTOLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        System.out.println(linkedList);
    }
}
