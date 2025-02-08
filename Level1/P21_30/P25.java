package CodeKata.Level1.P21_30;

import java.util.Arrays;

public class P25 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
                .filter(num -> num % divisor == 0)
                .toArray();

        if (answer.length == 0){
            return new int[]{-1};
        }

        Arrays.sort(answer);
        return answer;
    }
}
