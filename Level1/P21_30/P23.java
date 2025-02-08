package CodeKata.Level1.P21_30;

public class P23 {
    public int solution(int num) {
        int cnt = 0;
        while(num != 1){
            if((num  % 2) == 0){
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            cnt++;
            if(cnt == 400){
                cnt = -1;
                break;
            }
        }
        return cnt;
    }
}
