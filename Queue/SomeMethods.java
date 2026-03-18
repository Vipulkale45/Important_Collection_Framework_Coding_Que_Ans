package JAP82.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class SomeMethods {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10); // safe
        q.add(20);   // may throw exception

        System.out.println(q.poll());   // null if empty
        System.out.println(q.remove()); // exception if empty
    }
}
