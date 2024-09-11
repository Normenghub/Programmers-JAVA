package 연습;
import java.util.*;
public class 완주하지못한선수 {
    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String,Integer> map  = new HashMap();
            for(int i = 0; i<completion.length; i++){
                if(map.containsKey(completion[i])){
                    map.put(completion[i],map.get(completion[i]) + 1);
                }else{
                    map.put(completion[i],1);
                }
            }
            for(int i = 0; i<participant.length; i++){
                if(!map.containsKey(participant[i])){
                    answer = participant[i];
                    break;
                }else{
                    map.put(participant[i],map.get(participant[i]) -1);
                    if(map.get(participant[i]) == 0){
                        map.remove(participant[i]);
                    }
                }
            }

            return answer;
        }
    }
}
