package 연습;
import java.util.*;
public class 모의고사 {
    class Solution {
        public int[] solution(int[] answers) {
            int[] answer;
            int[] save = new int[3];
            int max = -1;
            int count2 = 0;
            ArrayList<int[]> list = new ArrayList<int[]>();
            list.add(new int[]{1, 2, 3, 4, 5});
            list.add(new int[]{2, 1, 2, 3, 2, 4, 2, 5});
            list.add(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});
            for(int k = 0; k<3; k++){
                int index = 0;
                int count = 0;
                for(int i = 0; i < answers.length; i++){
                    if(index == list.get(k).length){
                        index = 0;
                    }
                    if(list.get(k)[index++] == answers[i]){
                        count ++;
                    }
                }
                save[k] = count;

            }
            for(int i =0 ; i < 3; i ++){
                if(save[i] > max){
                    max = save[i];
                }
            }
            for(int i = 0; i < 3; i++){
                if(save[i] == max){
                    count2++;
                }
            }
            answer= new int[count2];
            int idx = 0;
            for(int i = 0; i < 3; i++){
                if(save[i] == max){
                    answer[idx++] = i+1;
                }
            }
            return answer;
        }
    }
}
