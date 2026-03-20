package JAP82.Collection.HashMap;

import java.util.HashMap;

public class StoreKeyValuePair {
    public static void main(String[] args) {
        HashMap<Integer, String> map= new HashMap<>();
        map.put(1, "Vipul");
        map.put(1, "Vishal");
        map.put(2,"rahul");
        System.out.println(map); 
    }
}
