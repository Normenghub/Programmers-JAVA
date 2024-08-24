package 연습;

public class 약수의합 {
    class Solution {
        public Long solution(int n) {
            Long answer = 0L;
            for(int i = 1; i<= n; i++){
                if(n % i == 0){
                    answer += (long) i;
                }
            }
            return answer;
        }
    }
}
