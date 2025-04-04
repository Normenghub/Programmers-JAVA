package Level2;

public class 마법의엘리베이터 {
    class Solution {
        public int solution(int storey) {
            int answer = 0;

            while(storey > 0){
                int curr = storey % 10;
                int next = (storey / 10) % 10;
                if(curr > 5 || (curr == 5 && next >=5)){
                    answer += 10 - curr;
                    storey += 10 - curr ;
                }else{
                    answer += curr;
                }
                storey /= 10;
            }
            return answer;
        }
    }
}
