package JAP82.Collection.Stackk;

import java.util.Stack;

public class SearchElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        int p = stack.search(20);
        if(p!=-1){
            System.out.println("element found at position: " + p);
        }else{
            System.out.println("element not found");
        }
    }
}
