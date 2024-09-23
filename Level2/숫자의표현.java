package Level2;

public class 숫자의표현 {
    class Solution {
        public int solution(int n) {
            int answer = 1;
            int addIndex = 1;
            int removeIndex =1;
            int presentValue = 0;

            while(addIndex !=n+1){
                if(presentValue < n){
                    presentValue += addIndex++;
                }else if(presentValue > n){
                    presentValue -= removeIndex++;
                }else if(presentValue == n){
                    answer++;
                    presentValue -= removeIndex++;
                }

            }
            return answer;
        }
    }
}
