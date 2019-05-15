package codility;

import java.util.*;

public class MissingInteger {

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < A.length; i++) {
            if(A[i] > 0) {
                set.add(A[i]);
            }
        }
        if(set.size() == 0) {
            return 1;
        }

        List<Integer> aa = new ArrayList<>(set);
        Collections.sort(aa);

        for(int i = 0; i < aa.size(); i++) {
            if(aa.get(0) > 1) {
                return 1;
            }
            if(i == aa.size()-1) {
                break;
            }
            if(aa.get(i+1) != aa.get(i)+1) {
                return aa.get(i) + 1;
            }
        }
        return aa.get(aa.size()-1) + 1;
    }


    public int solution2(int[] A) {
        Arrays.sort(A);
        int answer = 1;

        for(int value : A) {
            if (answer == value || answer == value + 1) {
                answer = value + 1;
            } else if (answer < value + 2) {
                return answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        MissingInteger missingInteger = new MissingInteger();

        int[] arr= {-1,-3,2,4};

        System.out.println(missingInteger.solution2(arr));

    }
}
