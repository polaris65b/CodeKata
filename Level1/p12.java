package CodeKata.Level1;

class p12 {
    public double solution(int[] arr) {
        double answer = 0;

        for(int num : arr)
            answer += num;

        answer /= arr.length;

        return answer;
    }
}