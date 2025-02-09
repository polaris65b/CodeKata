package CodeKata;

import CodeKata.Level1.P21_30.*;

public class Main {
    public static void main(String[] args) {
        P26 sol = new P26();

        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(sol.solution(absolutes, signs));

        absolutes = new int[]{1, 2, 3};
        signs = new boolean[]{false, false, true};
        System.out.println(sol.solution(absolutes, signs));
    }
}