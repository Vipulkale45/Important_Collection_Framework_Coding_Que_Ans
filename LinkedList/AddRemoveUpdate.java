//add, remove, and update elements in a LinkedList.
package JAP82.Collection.LinkedList;

import java.util.LinkedList;

public class AddRemoveUpdate {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("watermelon");

        //list.remove("Banana");
        list.set(3 , "Orange");

        System.out.println(list);
    }
}
