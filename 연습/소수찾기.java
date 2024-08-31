package 연습;
// 에라토스테네스의 체
public class 소수찾기 {
    class Solution {
        public int solution(int num) {
            int answer = 0;
            boolean[] prime = new boolean[1000001];
            for(int i = 2; i <= num; i++){
                if(!prime[i]){
                    answer++;
                    int index = 1;
                    while(i * index <=1000000){
                        prime[i * index] = true;
                        index++;
                    }
                }
            }
            return answer;
        }
    }
}
