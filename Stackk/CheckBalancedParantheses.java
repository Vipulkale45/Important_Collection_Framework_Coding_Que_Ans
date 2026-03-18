package JAP82.Collection.Stackk;

import java.util.Stack;

public class CheckBalancedParantheses {
    public static void main(String[] args) {
        String str = "{[()]}";
        Stack<Character> stack = new Stack<>();
        
        boolean isBalanced = true;

        for(char ch: str.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    isBalanced = false;
                    break;
                }
                char top = stack.pop();
                if((ch==')' && top!='(')||(ch=='}'&&top!='{')||(ch==']'&& top!='['))
                {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) isBalanced = false;
        System.out.println(isBalanced ? "Balanced" : "Not Balanced");
    }
}
