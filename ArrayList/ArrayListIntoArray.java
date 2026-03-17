package JAP82.Collection.ArrayList;

import java.util.ArrayList;

public class ArrayListIntoArray {
    public static void main (String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("vipul");
        list.add("python");
        list.add("vishal");

        String[] arr = list.toArray(new String[0]);

        for(String s: arr){
            System.out.println(s);
        }
    }
}
