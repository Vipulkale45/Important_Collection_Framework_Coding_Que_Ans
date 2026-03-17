//2. Write a Java program to traverse an ArrayList using for loop.
package JAP82.Collection.ArrayList;

import java.util.ArrayList;

public class TraverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(85);
        list.add(75);
        list.add(84);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
