package codility;

import java.util.Arrays;

public class MaxCounter {

    private int[] solution(int n, int[] array) {
        int[] result = new int[n];

        for(int i = 0 ; i < array.length; i++) {
            if(array[i] < n) {
                result[array[i]-1] = result[array[i]-1] + 1;
            } else {
                int [] temp;
                temp = result;
                if(n == 1) {
                    temp[0] = array[0];
                }
                Arrays.sort(temp);
                for(int j = 0 ; j < result.length; j++) {
                    result[j] = temp[n-1];
                }
            }
        }

        return result;
    }

    public int[] solution2(int N, int[] A) {
        int[] result = new int[N];
        int max = 0;
        for(int value : A) {
            if(value >  N) {
                Arrays.fill(result, max);
            } else {
                int resultValue = value-1;
                result[resultValue] = result[resultValue] + 1;
                if(max < result[resultValue]) {
                    max = result[resultValue];
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        MaxCounter maxCounter = new MaxCounter();
        int[] array = {3,4,4,6,1,4,4};
//        int[] result = maxCounter.solution(5,array);
        //int[] array = {3};
        int[] result = maxCounter.solution2(5,array);

        for(int i = 0 ; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
