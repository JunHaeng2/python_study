package programmers;

public class 약수의개수와덧셈 {
    class Solution {
        public int solution(int left, int right) {
            int answer = 0;

            for (int i = left; i <= right; i++) {
                int cnt = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) cnt++;
                }
                if (cnt % 2 == 0) answer += i;
                if (cnt % 2 != 0) answer -= i;
            }

            return answer;
        }
    }
}
