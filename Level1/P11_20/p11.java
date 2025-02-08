package CodeKata.Level1.P11_20;

class p11 {
    public String solution(int num) {
        String answer = "";

        if(num % 2 == 0)
            answer = "Even";
        else
            answer = "Odd";

        return answer;
    }
}
