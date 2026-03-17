package JAP82.Collection.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;

public class FindDuplicatesElements {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(40);

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num: list){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates element " + duplicates);
    }
}
