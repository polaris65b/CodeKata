package CodeKata.Level1;

class p10 {
    public double solution(int[] numbers) {
        double answer = 0;

        for(int num : numbers){
            answer += num;
        }
        answer /= numbers.length;

        return answer;
    }
}