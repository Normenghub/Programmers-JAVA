package Level2;
import java.util.*;

public class HIndex {
    class Solution {
        public int solution(int[] citations) {
            int answer = 0;
            ArrayList<Integer> list = new ArrayList();
            for(int data : citations){
                list.add(data);
            }
            Collections.sort(list);
            for(int i = 0 ; i<citations.length; i++){
                if(list.get(i) >= list.size() - i){
                    answer = list.size() - i;
                    break;
                }
            }
            return answer;
        }
    }
}
