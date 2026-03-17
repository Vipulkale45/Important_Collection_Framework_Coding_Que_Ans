package JAP82.Collection.LinkedList;

import java.util.LinkedList;

public class TraverseUsingForEachLoop {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        for(String s: list){
            System.out.println(s);
        }

    }
}
