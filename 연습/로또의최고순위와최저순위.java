package 연습;

public class 로또의최고순위와최저순위 {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int highscore = 0;
            int lowscore = 0;
            int zeroCount = 0;
            for(int data : win_nums){
                for(int lottoNum : lottos){
                    if(data == lottoNum){
                        lowscore++;
                    }
                }

            }
            if(lowscore>=2){
                answer[1] = 7 - lowscore;
            }else{
                answer[1] = 6;
            }
            for(int lottoNum : lottos){
                if(0 == lottoNum){
                    zeroCount++;
                }
            }
            if(zeroCount == 6){
                answer[0] = 1;
            }else{
                answer[0] = answer[1] - zeroCount;
            }

            return answer;
        }
    }
}
