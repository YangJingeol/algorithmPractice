package codility;

import org.junit.Test;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        float minAvgForTwo = 1000000000;
        float minAvgForThree = 1000000000;
        int twoIndex = 0;
        int threeIndex = 0;

        for(int i = 0 ; i < A.length -1; i++) {
            float avg = getAvgForTwo(A[i], A[i+1]);
            if(avg < minAvgForTwo) {
                minAvgForTwo = avg;
                twoIndex = i;
            }
        }

        for(int i = 0 ; i < A.length-2; i++) {
            float avg = getAvgForThree(A[i], A[i+1], A[i+2]);
            if(avg < minAvgForThree) {
                minAvgForThree = avg;
                threeIndex = i;
            }
        }

        if(minAvgForTwo > minAvgForThree) {
            return threeIndex;
        }
        return twoIndex;
    }

    private float getAvgForTwo(int a, int b) {
        return (float) (a + b) / 2;
    }

    private float getAvgForThree(int a, int b, int c) {
        return (float) (a + b + c) / 3;
    }

    @Test
    public void test() {
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
        int[] arr = {-3, -5, -8, -4, -10};
        System.out.println(minAvgTwoSlice.solution(arr));
    }
}
