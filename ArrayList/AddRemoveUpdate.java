//1. Write a program to add, remove, and update elements in an ArrayList.
package JAP82.Collection.ArrayList;

import java.util.ArrayList;

public class AddRemoveUpdate {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("python");
        list.add("c++");
        list.add("Data");

        //list.remove("Data");
        list.set(3, "javascript");
        System.out.println(list);
    }
}



