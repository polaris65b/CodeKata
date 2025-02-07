package CodeKata.Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class p20 {
    public long solution(long n){
        List<Long> nums = new ArrayList<>();
        while(n > 0){
            nums.add((long)(n%10));
            n /= 10;
        }
        Collections.sort(nums, Collections.reverseOrder());
        long answer = 0;
        for(long num : nums){
            answer = answer * 10 + num;
        }
        return answer;
    }
}