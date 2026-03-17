//Write a Java program to find the frequency of each element in an ArrayList
package JAP82.Collection.ArrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyOfEachElement {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(30);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: list){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
        
    }
    
}
