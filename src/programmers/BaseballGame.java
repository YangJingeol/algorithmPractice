package programmers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

    public int solution(int[][] baseball) {
        List<Integer> answerList = new ArrayList<>();

        for(int k = 123 ; k < 1000; k++) {
            int [] random = getArray(k);
            if(random == null) {
                continue;
            }
            boolean isCorrect = true;

            int outCount = 0;
            for (int[] ints : baseball) {
                Result result = game(ints, random);
                if (result.isOut) {
                    outCount++;
                    System.out.println(outCount);
                }

                if (outCount == 3 || !result.isSuccess) {
                    isCorrect = false;
                    break;
                }
            }

            if(isCorrect) {
                answerList.add(k);
            }
        }
        return answerList.size();
    }

    private int[] getArray(int num) {
        int ran1 = num/100;
        int ran2 = (num/10) % 10;
        int ran3 = num % 10;

        if(ran1 == ran2 || ran1 == ran3 || ran2 == ran3) {
            return null;
        }
        return new int[] {ran1, ran2, ran3};
    }

    private Result game(int[] baseball, int[] user) {
        int strike = 0;
        int ball = 0;
        boolean isSuccess;
        boolean isOut = false;
        int[] baseballArr = getArray(baseball[0]);

        for(int i = 0 ; i < baseball.length; i++) {
            for(int j = 0 ; j < user.length; j++) {
                if(baseballArr[i] == user[j]) {
                    if(i==j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        if(strike==0 && ball == 0) {
            isOut = true;
        }

        if(baseball[1] == strike && baseball[2] == ball) {
            isSuccess = true;
        } else {
            isSuccess = false;
        }


        return new Result(isSuccess, isOut);
    }

    public class Result {
        private boolean isSuccess;
        private boolean isOut;

        Result(boolean isSuccess, boolean isOut) {
            this.isSuccess = isSuccess;
            this.isOut = isOut;
        }
    }


    @Test
    public void test() {
        BaseballGame baseballGame = new BaseballGame();

        int[][] problem = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};

        System.out.println(baseballGame.solution(problem));
    }

    public static void main(String[] args) {
       BaseballGame baseballGame = new BaseballGame();

       int[][] problem = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};

        System.out.println(baseballGame.solution(problem));
    }
}
