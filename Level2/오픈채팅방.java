package Level2;
import java.util.*;

public class 오픈채팅방 {
    class Solution {
        public String[] solution(String[] record) {
            HashMap<String,String> map = new HashMap();
            ArrayList<String> list = new ArrayList();
            for(String data : record){
                String[] recordData = data.split(" ");
                if(recordData[0].equals("Enter") || recordData[0].equals("Change")) map.put(recordData[1],recordData[2]);
            }
            for(int i = 0; i<record.length; i++){
                String[] recordData = record[i].split(" ");
                if(recordData[0].equals("Enter")){
                    list.add(map.get(recordData[1]) + "님이 들어왔습니다.");
                }else if(recordData[0].equals("Leave")){
                    list.add(map.get(recordData[1]) + "님이 나갔습니다.");
                }
            }
            String[] answer = new String[list.size()];
            for(int i = 0; i< list.size(); i++){
                answer[i] = list.get(i);
            }


            return answer;
        }
    }





}
