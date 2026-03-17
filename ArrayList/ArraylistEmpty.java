package JAP82.Collection.ArrayList;

import java.util.ArrayList;

public class ArraylistEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        if(list.isEmpty()){
            System.out.println("ArrayList is empty");
        }else{
            System.out.println("not");
        }
    }
}
