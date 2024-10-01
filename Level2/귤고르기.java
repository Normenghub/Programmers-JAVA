package Level2;
import java.util.*;
public class 귤고르기 {
    class Solution {
        public int solution(int k, int[] tangerine) {
            int answer = 0;
            int present = 0;
            HashMap<Integer,Integer> map = new HashMap();
            for(int data: tangerine){
                if(!map.containsKey(data)){
                    map.put(data,1);
                }else{
                    map.put(data,map.get(data) + 1);
                }
            }
            List<Map.Entry<Integer,Integer>> list = new LinkedList<>(map.entrySet());
            list.sort(Map.Entry.comparingByValue());
            int x = list.size();
            while(present < k) {
                present += list.get(--x).getValue();
                answer++;
            }

            return answer;
        }
    }
}
