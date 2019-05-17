package codility;

public class PassingCars {

    private int solution(int[] A) {
        int result = 0;

        for(int i = 0 ; i < A.length; i++) {
            if(A[i] == 0) {
                int countOne = 0;
                for(int j = i+1; j < A.length; j++) {
                    if(A[j] == 1) {
                        countOne++;
                    }
                }
                result += countOne;
            }
        }

        if (result > 1000000000 || result < 0) {
            return -1;
        }

        return result;
    }

    private int solution2(int[] A) {
            // write your code in Java SE 8
            int cnt = 0;
            int totCnt = 0;
            for(int i=0; i<A.length; i++) {
                if(A[i] == 0) {
                    cnt++;
                } else {
                    totCnt += cnt;
                }
            }

            if (totCnt > 1000000000 || totCnt < 0) {
                return -1;
            }
            return totCnt;


    }

    public static void main(String[] args) {
        PassingCars passingCars = new PassingCars();
        int[] arr = {0,1,0,1,1};
        System.out.println(passingCars.solution2(arr));
    }
}
