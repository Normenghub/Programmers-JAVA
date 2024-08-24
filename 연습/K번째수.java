package 연습;

import java.util.*;
public class K번째수 {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            for(int i = 0; i<answer.length; i++){
                int[] save = new int[commands[i][1]-commands[i][0] + 1];
                int index = 0;
                for(int k = commands[i][0]-1; k < commands[i][1]; k++){
                    save[index++] = array[k];
                }
                Arrays.sort(save);
                answer[i] = save[commands[i][2]-1];
            }
            return answer;
        }
    }
}
