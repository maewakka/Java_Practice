package Collection.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

    public void Execute() {
        ArrayList list1 = new ArrayList(10);

        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);

        print(list1, list2);

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");

        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        list1.retainAll(list2);

        print(list1, list2);


    }

    void print(ArrayList list1, ArrayList list2) {
        System.out.println("List1 is " + list1 + ", List2 is " + list2);
    }

}
