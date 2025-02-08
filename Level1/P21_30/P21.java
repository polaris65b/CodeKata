package CodeKata.Level1.P21_30;


class P21 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int input = x;
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        if((input % sum) != 0){
            answer = false;
        }

        return answer;
    }
}