package JAP82.Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class TraverseUsingIterator {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
