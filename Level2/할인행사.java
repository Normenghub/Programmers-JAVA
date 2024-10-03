package Level2;
import java.util.*;

public class 할인행사 {
    class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            int answer = 0;
            int count = 0;
            boolean result = false;
            HashMap<String,Integer> map = new HashMap();
            HashMap<String,Integer> save = new HashMap();
            for(int i = 0; i<want.length; i++){
                map.put(want[i],number[i]);
                save.put(want[i],0);
            }
            for(int i = 0; i<10; i++){
                if(!save.containsKey(discount[i])){
                    continue;
                }
                save.put(discount[i],save.get(discount[i]) + 1);
            }
            for(int i = 10; i< discount.length; i++){
                boolean flag = true;
                for(String data : map.keySet()){
                    if(save.get(data) < map.get(data)){
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    answer++;
                }
                if(save.containsKey(discount[count])) save.put(discount[count],save.get(discount[count]) - 1);
                count++;
                if(save.containsKey(discount[i])) save.put(discount[i],save.get(discount[i]) + 1);



            }
            boolean flag = true;
            for(String data : map.keySet()){
                if(save.get(data) < map.get(data)){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                answer++;
            }

            return answer;
        }
    }
}
