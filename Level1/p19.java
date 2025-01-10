package CodeKata.Level1;

public class p19 {
    public long solution(long n) {
        long left = 1, right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == n) {
                return (mid + 1) * (mid + 1);
            } else if (square < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        p19 sol = new p19();
        System.out.println(sol.solution(121));
    }
}
