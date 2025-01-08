package CodeKata.Level1;

import java.util.ArrayList;

public class p17 {
    public int[] solution(long n){
        ArrayList<Integer> list = new ArrayList<>();

        while(n > 0){
            list.add((int)(n%10));
            n /= 10;
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        p17 sol = new p17();
        int[] result = sol.solution(12345);
        for(int num : result){
            System.out.println(num + " ");
        }
    }
}
