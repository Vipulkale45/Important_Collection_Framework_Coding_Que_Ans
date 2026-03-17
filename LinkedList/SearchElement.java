package JAP82.Collection.LinkedList;

import java.util.LinkedList;

public class SearchElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("java");
        list.add("Python");
        list.add("c++");
        list.add("Javascript");

        String search = "Python";
        if(list.contains(search)){
            System.out.println(search + " found");
        }else{
            System.out.println(search + " not found");
        }
    }
}
