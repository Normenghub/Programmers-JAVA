package 연습;

public class 삼총사 {
    class Solution {
        public int solution(int[] number) {
            int answer = 0;
            for(int i = 0; i < number.length-2; i++){
                for(int k = i+1; k<number.length-1; k++){
                    for(int j = k+1; j<number.length; j++){
                        if(number[i] + number[k] + number[j] ==0){
                            answer++;
                        }
                    }
                }
            }
            return answer;
        }
    }
}
