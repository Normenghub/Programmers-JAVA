package Level2;

public class 카펫 {
    class Solution {
        public int[] solution(int brown, int yellow) {
            boolean flag = false;
            int[] answer = {0,0};
            int yIndex = 3;
            while(true){
                int xIndex = yIndex;
                while(true){
                    if(brown + yellow < xIndex * yIndex) break;
                    int sumBrown = (xIndex * 2) + ((yIndex - 2) * 2);
                    int sumYellow = (yIndex * xIndex) - sumBrown;
                    if(sumBrown == brown && sumYellow == yellow){
                        flag = true;
                        answer[0] = xIndex;
                        answer[1] = yIndex;
                        break;
                    }
                    xIndex++;

                }
                if(flag) break;
                yIndex++;
            }
            return answer;
        }
    }
}
