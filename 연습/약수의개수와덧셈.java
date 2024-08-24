package 연습;

public class 약수의개수와덧셈 {
    class Solution {
        public int solution(int left, int right) {
            int answer = 0;
            int count;
            for(int i = left; i <= right; i++){
                count = 0;
                for(int k = 1; k<=i; k++){
                    if(i%k ==0){
                        count ++;
                    }
                }
                if(count %2==0){
                    answer += i;
                }else{
                    answer -=i;
                }
            }

            return answer;
        }
    }
}
