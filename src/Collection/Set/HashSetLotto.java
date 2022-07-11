package Collection.Set;

import java.util.*;

public class HashSetLotto {

    public void Execute() {
        Set set = new HashSet();

        for(int i=0; set.size()<6; i++) {
            int num = (int) (Math.random() *45) + 1;
            set.add(num);
        }

        System.out.println(set);
    }

}
