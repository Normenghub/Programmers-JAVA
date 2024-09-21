package Level2;
import java.util.*;
public class 최댓값과최솟값 {
    class Solution {
        public String solution(String s) {
            String[] arr = s.split(" ");
            int[] answer = new int[arr.length];
            for(int i = 0; i<arr.length; i++){
                answer[i] = Integer.parseInt(arr[i]);
            }
            Arrays.sort(answer);
            String result = "";
            result += Integer.toString(answer[0]);
            result+= " ";
            result += Integer.toString(answer[answer.length - 1]);

            return result;
        }
    }
}
