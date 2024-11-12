package Level2;
import java.util.*;

public class Tree차압축 {
    class Solution {
        public int[] solution(String msg) {
            int count = 1;
            HashMap<String,Integer> map = new HashMap();
            ArrayList<Integer> list = new ArrayList();
            for(int i = 65; i<=90; i++) map.put(Character.toString((char) i), count++);
            int index = 0;
            String element = "";
            while(true){
                if(index == msg.length()){
                    list.add(map.get(element));
                    break;
                }
                element += msg.charAt(index);
                if(map.containsKey(element)){
                    index++;
                    continue;
                }else{
                    map.put(element,count++);
                    list.add(map.get(element.substring(0,element.length()-1)));
                    element = "";
                }
            }
            int[] answer = new int[list.size()];
            for(int i = 0 ; i<list.size(); i++) answer[i] = list.get(i);
            return answer;
        }
    }
}
