package JAP82.Collection.ArrayList;

import java.util.ArrayList;

public class MergeArrayList {
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list.add(40);

        list.addAll(list2);
        System.out.println(list);
    }
}
