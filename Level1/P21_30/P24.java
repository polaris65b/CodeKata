package CodeKata.Level1.P21_30;

public class P24 {
    public String solution(String[] seoul) {
        String answer = "";
        int x = 0;
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                x = i;
                break;
            }
        }
        answer = "김서방은 "+ x +"에 있다";
        return answer;
    }

}
