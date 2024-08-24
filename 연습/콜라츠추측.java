package 연습;

public class 콜라츠추측 {
    class Solution {
        public int solution(long num) {
            int answer = 0;
            while(true){
                if(answer>=500){
                    return -1;
                }
                if(num == 1){
                    break;
                }else if(num % 2 == 0){
                    num = (long) num /2;
                    answer++;
                }else if(num % 2 != 0){
                    num = (long) num * 3 + 1;
                    answer++;
                }
            }
            return answer;
        }
    }
}
