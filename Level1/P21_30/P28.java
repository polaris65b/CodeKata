package CodeKata.Level1.P21_30;

public class P28 {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }
}