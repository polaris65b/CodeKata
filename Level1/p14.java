package CodeKata.Level1;

public class p14 {
    public static void main(String[] args) {
        int n = 5;
        int answer = 0;

        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
