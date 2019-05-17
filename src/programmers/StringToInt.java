package programmers;

public class StringToInt {
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        StringToInt stringToInt = new StringToInt();
        System.out.println(stringToInt.solution("-1234"));
    }
}
