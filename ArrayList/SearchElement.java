package JAP82.Collection.ArrayList;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        String search = "Blue";

        if(list.contains(search)){
            System.out.println(search+ " found");
        }else{
            System.out.println(search + " found");
        }
    }
}
