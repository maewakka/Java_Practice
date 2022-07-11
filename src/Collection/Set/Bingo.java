package Collection.Set;

import java.util.*;

public class Bingo {

    public void Execute() {
        Set set = new HashSet();
        int[][] board = new int[5][5];

        for(int i=0; set.size()<25; i++) {
            int number = (int) (Math.random() * 50) + 1;
            set.add(number);
        }

        Iterator it = set.iterator();

        for(int i=0; i<board.length; i++) {
            for(int j=0; j< board.length; j++) {
                board[i][j] = Integer.parseInt(String.valueOf(it.next()));
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }

    }

}
