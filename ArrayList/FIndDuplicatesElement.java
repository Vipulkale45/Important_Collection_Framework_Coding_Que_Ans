package JAP82.Collection.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class FIndDuplicatesElement {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(10);

        HashSet<Integer> see = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num:list){
            if(!see.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates elements: " + duplicates);
    }
}
