// Write a Java program to convert an array into ArrayList
package JAP82.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayIntoArrayList {
    public static void main(String[] args){
        String[] arr = {"Anurag","vipul", "manish", "vishal","sagar"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}
