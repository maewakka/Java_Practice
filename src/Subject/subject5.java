package Subject;

import java.util.Scanner;

public class subject5 {

    public void Exercise5_4() {
        int[][] arr = {
                {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total = 0;
        float count = 0;
        float average = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                total += arr[i][j];
            }
            count += arr[i].length;
        }

        average = total/count;

        System.out.println(total);
        System.out.println(average);

    }

    public void Exercise5_5() {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        for(int i=0; i<ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;

            tmp = ballArr[j];
            ballArr[j] = ballArr[i];
            ballArr[i] = tmp;
        }

        for(int i=0; i<3; i++) {
            ball3[i] = ballArr[i];
            System.out.println(ball3[i]);
        }


    }

    public void Exercise5_6() {
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money = " + money);

        for(int i=0; i< coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원은 " + money / coinUnit[i] + "개");
            money = money % coinUnit[i];
        }
    }

    public void Exercise5_7() {
        Scanner scanner = new Scanner(System.in);
        int return_money = Integer.parseInt(scanner.next());

        int[] coinUnit = {500, 100, 50, 10};
        int[] coin = {5, 5, 5, 5};

        System.out.println("money = " + return_money);

        for(int i=0; i< coinUnit.length; i++) {
            int coinNum = return_money / coinUnit[i];

            if(coin[i] - coinNum <= 0) {
                return_money = return_money - (coinUnit[i] * coin[i]);
                coin[i] = 0;
            }
            else {
                return_money = return_money % coinUnit[i];
                coin[i] -= coinNum;
            }

            System.out.println(coinUnit[i] +"원 : " + (coin[i] == 0 ? 5 : 5-coin[i]));
        }
        if(return_money > 0) {
            System.out.println("거스름돈이 부족합니다.");
            return;
        }

        System.out.println("==남은 동전의 갯수==");

        for(int i=0; i<coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원: " + coin[i]);
        }
    }

    public void Exercise5_8() {
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
        int[] counter = new int[4];

        for(int i=0; i< answer.length; i++) {
            int number = answer[i];
            counter[--number]++;
        }

        for(int i=0; i< counter.length; i++) {
            System.out.println(counter[i] + "*".repeat(counter[i]));
        }
    }

    public void Exercise5_9() {
        char[][] star = {
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'}
        };

        char[][] result = new char[star[0].length][star.length];

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

        for(int i=0; i<star.length; i++) {
            for(int j=0; j<star[i].length; j++) {
                result[j][star.length - i - 1] = star[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    public void Exercise5_10() {
        char[] abcCode = { '`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','|','[',']','{', '}',';',':',',','.','/'};
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
        String src = "abc123";
        String result = "";

        for(int i=0; i<src.length(); i++) {
            char ch = src.charAt(i);
            if((int)ch > 96) {
                result += abcCode[(int)ch - 97];
            }
            else {
                result += numCode[(int)ch - 48];
            }
        }
        System.out.println("src : " + src);
        System.out.println("result : " + result);
    }

    public void Exercise5_11() {
        int[][] score = {
                {100, 100, 100} ,
                {20, 20, 20} ,
                {30, 30, 30} ,
                {40, 40, 40} ,
                {50, 50, 50}
        };
        int[][] result = new int[score.length+1][score[0].length+1];

        for(int i=0; i< score.length; i++) {
            for(int j=0; j<score[i].length; j++) {
                if(j != score[i].length) {
                    result[i][j] = score[i][j];
                    result[i][score[i].length] += score[i][j];
                }
                result[score.length][j] += score[i][j];
                result[score.length][score[i].length] += score[i][j];
            }
        }

        for(int i=0; i < result.length;i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }
    }

    public void Exercise5_12() {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in);

        int right_count = 0;

        for(int i=0; i< words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n");
                right_count++;
            }
            else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
            }
        }
        System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.%n", words.length, right_count);
    }

    public void Exercise5_13() {
        String[] words = { "television", "computer", "mouse", "phone" };

        Scanner scanner = new Scanner(System.in);
    }

}
