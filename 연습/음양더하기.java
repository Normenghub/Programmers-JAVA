package 연습;

public class 음양더하기 {
    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for(int i = 0; i < signs.length; i++){
                if(signs[i] == false){
                    answer -= absolutes[i];
                }else{
                    answer+=absolutes[i];
                }
            }
            return answer;
        }
    }
}
