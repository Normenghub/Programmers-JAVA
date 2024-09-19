package 연습;
import java.util.*;

public class 신고결과받기 {
    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];
            HashMap<String,Integer> map = new HashMap();
            HashMap<String,Integer> idMap = new HashMap();
            HashMap<String, HashMap<String,Boolean>> front = new HashMap();
            HashMap<String, HashMap<String,Boolean>> back = new HashMap();
            ArrayList<String> list = new ArrayList();
            int index = 0;
            for(String data : id_list){
                map.put(data,0);
                idMap.put(data,index++);
                front.put(data, new HashMap());
            }
            for(String data : report){
                String[] members = data.split(" ");
                if(!front.get(members[1]).containsKey(members[0])) {
                    front.get(members[1]).put(members[0],true);
                    map.put(members[1],map.get(members[1]) + 1);
                }

            }
            for(String data : id_list){
                if(map.get(data) >=k){
                    list.add(data);
                }
            }
            for(int i = 0; i< list.size(); i++){

                for(String data :front.get(list.get(i)).keySet()){
                    answer[idMap.get(data)]++;
                }
            }

            return answer;
        }
    }
}
