package codility;

public class FrogJump {

    private static int fromJump(int start, int goal, int distance) {
        int count = 0;

        while(start <= goal) {
            start = start + distance;
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(fromJump(10, 85, 30));
    }
}
