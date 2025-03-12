package Level2;
import java.util.*;
public class 스킬트리 {
    class Solution {
        public int solution(String skill, String[] skill_trees) {
            int answer = 0;
            HashMap<String,Integer> map = new HashMap();
            for(int i =0; i< skill.length(); i++){
                map.put(Character.toString(skill.charAt(i)),i+1);
            }
            for(String d : skill_trees){
                String data = d;
                boolean flag = true;
                int count = 0;
                for(String str : map.keySet()){
                    data = data.replaceAll(str,Integer.toString(map.get(str)));
                }
                for(int i = 0; i<data.length(); i++){
                    if((65<= data.charAt(i))&&(data.charAt(i) <= 90)){
                        continue;
                    }else{
                        if(count + 1 == Integer.parseInt(data.substring(i,i+1))){
                            count = Integer.parseInt(data.substring(i,i+1));
                        }else{
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag) answer++;

            }
            return answer;
        }
    }
}
