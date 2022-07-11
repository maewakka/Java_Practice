package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

    public void Execute() {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        List list = new ArrayList<>(length + 10);

        for(int i=0; i<length; i+=LIMIT) {
            if(i+LIMIT < length)
                list.add(source.substring(i, i+LIMIT));
            else
                list.add(source.substring(i));
        }

        System.out.println(list);

    }

}
