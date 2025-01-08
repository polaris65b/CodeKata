package CodeKata.Level1;

public class p15 {
    public static void main(String[] args) {
        int n = 12;
        int answer = 0;

        for(answer = 1; answer <= n; answer++){
            if(n % answer == 1){
                System.out.println(answer);
                break;
            }
        }
    }
}
