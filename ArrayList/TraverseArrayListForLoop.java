package JAP82.Collection.ArrayList;

import java.util.ArrayList;

public class TraverseArrayListForLoop {
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        for(Integer s: list){
            System.out.println(s);
        }
    }
}
