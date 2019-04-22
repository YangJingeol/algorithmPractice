package codility;

public class FrogJump {

    private static int fromJump(int start, int goal, int distance) {
        // 시간 복잡도에서 탈락.... 다시 코딩
        /*
        int count = 0;


        while(start < goal) {
            start = start + distance;
            count++;
        }

        return count;
        */

        int result = (goal-start)/distance;

        if((goal-start)%distance != 0) {
            result ++;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(fromJump(10, 85, 30));
    }
}
