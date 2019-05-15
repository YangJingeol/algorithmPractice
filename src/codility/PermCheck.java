package codility;

import java.util.Arrays;

public class PermCheck {

    public int solution(int[] problem) {
        Arrays.sort(problem);

        for(int i = 1 ; i <= problem.length; i++) {
            if(problem[i-1] != i) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        int[] problem = {4,1,3};

        System.out.println(permCheck.solution(problem));
    }
}
