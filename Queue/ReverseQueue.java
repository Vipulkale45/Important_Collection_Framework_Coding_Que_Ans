package JAP82.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            s.push(q.poll());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
        System.out.println(q);
    }
}
