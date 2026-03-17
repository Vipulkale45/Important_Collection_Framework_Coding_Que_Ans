package JAP82.Collection.Stackk;

import java.util.Stack;

public class StackEmpty {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        if(s.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("not empty");
        }
    }
}
