package programmers;

import java.util.*;

public class RectanglePoint {

    public int[] solution(int[][] v) {
        Set<Integer> xPoint = new HashSet<>();
        Set<Integer> yPoint = new HashSet<>();

        for(int i = 0 ; i < v.length; i++) {
            if(xPoint.contains(v[i][0])) {
                xPoint.remove(v[i][0]);
            } else {
                xPoint.add(v[i][0]);
            }

            if(yPoint.contains(v[i][1])) {
                yPoint.remove(v[i][1]);
            } else {
                yPoint.add(v[i][1]);
            }
        }
        int right = xPoint.iterator().next();
        int left = yPoint.iterator().next();
        int[] answer = {right, left};

        return answer;
    }

    public static void main(String[] args) {
        RectanglePoint rectanglePoint = new RectanglePoint();

        int [][] problem = {{1, 4}, {3, 4}, {3, 10}};

        int[] answer = rectanglePoint.solution(problem);

        for(int i = 0 ; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
