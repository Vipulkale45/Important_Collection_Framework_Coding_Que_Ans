package JAP82.Collection.LinkedList;

import java.util.LinkedList;

public class MiddleElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(70);
        list.add(80);

        int middleindex = list.size()/2;
        System.out.println("Middle Element : " + list.get(middleindex));
    }
}
