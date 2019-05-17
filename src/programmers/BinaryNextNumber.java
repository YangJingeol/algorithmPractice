package programmers;

public class BinaryNextNumber {

    public int solution(int n) {
        int oneCount = getBinaryOneCount(n);

        while (true) {
            n++;
            if(oneCount == getBinaryOneCount(n)) {
                break;
            }
        }
        return n;
    }


    public int getBinaryOneCount(int n) {
        String binary = Integer.toBinaryString(n);
        int oneCount = 0;
        for(int i = 0 ; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                oneCount++;
            }
        }
        return oneCount;
    }

    public static void main(String[] args) {
        BinaryNextNumber binaryNextNumber = new BinaryNextNumber();

        System.out.println(binaryNextNumber.solution(78));
    }
}
