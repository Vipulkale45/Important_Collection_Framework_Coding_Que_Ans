package JAP82.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InsertDelete {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println("Removed: "+ q.poll());
        System.out.println(q);
    }
}
