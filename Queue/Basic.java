//Implement queue using Queue interface and LinkedList

package JAP82.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Basic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        q.add(52);
        q.add(85);
        q.add(96);
        q.add(63);

        System.out.println(q);
    }
}
