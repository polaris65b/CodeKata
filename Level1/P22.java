package CodeKata.Level1;

public class P22 {
    public long solution(int a, int b) {
        long answer = 0;
        long maxNum = Math.max(a, b);
        long minNum = Math.min(a, b);
        answer = minNum;

        while(maxNum != minNum){
            minNum += 1;
            answer += minNum;
        }

        return answer;
    }
}
