package JAP82.Collection.LinkHashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ConvertLinkedHashSetToList {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3));

        List<Integer> list = new ArrayList<>(set);

        System.out.println(list);
    }
}
