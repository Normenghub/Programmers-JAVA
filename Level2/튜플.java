package Level2;
import java.util.*;
public class 튜플 {
    class Solution {
        public int[] solution(String s) {
            HashMap<String,Integer> map = new HashMap();
            String numSave = "";
            String str = "";
            int count = 0;
            int index = 0;
            for(int i = 0; i< s.length(); i++){
                if(((int) (s.charAt(i))) >=48 &&  ((int) (s.charAt(i))) <=57){
                    numSave += s.charAt(i);
                }else{
                    if(numSave.length() != 0){
                        if(!map.containsKey(numSave)){
                            map.put(numSave,1);
                        }else{
                            map.put(numSave,map.get(numSave) + 1);
                        }
                        numSave= "";
                    }
                }

            }
            int[] answer = new int[map.size()];
            int leng = map.size();
            for(int i = 0; i<leng; i++){
                for(String data : map.keySet()){
                    if(map.get(data) > count){
                        count = map.get(data);
                        str = data;
                    }
                }
                answer[index++] = Integer.parseInt(str);
                map.remove(str);
                str = "";
                count = 0;
            }


            return answer;
        }
    }
}
