package CodeKata.Level1.P11_20;

import java.util.Arrays;

public class p16 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        p16 instance = new p16();
        long[] result = instance.solution(2, 5);
        System.out.println(Arrays.toString(result));
    }
}