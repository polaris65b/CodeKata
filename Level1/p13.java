package CodeKata.Level1;

import java.util.*;

public class p13 {
    public int solution(int n) {
        int answer = 0;

        while(n > 0){
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}