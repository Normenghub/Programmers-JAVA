package 연습;
import java.util.*;
public class 추억점수 {
    class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];
            HashMap<String,Integer> hash = new HashMap<>();
            for(int i = 0; i< name.length; i++){
                hash.put(name[i],yearning[i]);
            }
            for(int i = 0; i< photo.length; i++){
                int sum = 0;
                for(int k = 0; k< photo[i].length; k++){
                    if(hash.containsKey(photo[i][k])){
                        sum += hash.get(photo[i][k]);
                    }
                }
                answer[i] = sum;
            }
            return answer;
        }
    }
}
