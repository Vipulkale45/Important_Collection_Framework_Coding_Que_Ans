package JAP82.Collection.Stackk;

import java.util.Stack;

public class CreateStackAndPushElements {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(50);
        System.out.println(stack);
    }
}
