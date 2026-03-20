package JAP82.Collection.HashMap;

import java.util.HashMap;

public class CountFreInArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,4,2,1,3,4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: a){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
    }
}
