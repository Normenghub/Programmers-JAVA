package 연습;
import java.util.*;
public class 개인정보수집유효기간 {
    class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {
            ArrayList<Integer> list = new ArrayList();
            String[] saveToday = today.split("\\.");
            int[] todayArr = new int[3];

            for(int i =0; i<todayArr.length; i++){
                todayArr[i] = Integer.parseInt(saveToday[i]);
            }
            HashMap<String,Integer> map = new HashMap();
            int index = 1;
            for(String term : terms){
                String[] termArr = term.split(" ");
                map.put(termArr[0],Integer.parseInt(termArr[1]));
            }
            for(String data : privacies){
                String[] testArr = data.split(" ");
                String[] separateArr = testArr[0].split("\\.");
                int[] saveArr = {(Integer.parseInt(separateArr[0])),(Integer.parseInt(separateArr[1]) + map.get(testArr[1])),(Integer.parseInt(separateArr[2]))};
                saveArr[0] += saveArr[1] / 12;
                saveArr[1] = saveArr[1] % 12;
                if(saveArr[1] == 0){
                    saveArr[0]--;
                    saveArr[1] = 12;
                }
                boolean flag = true;
                if(saveArr[0] < todayArr[0]){
                    list.add(index++);
                    continue;
                }else if(saveArr[0] > todayArr[0]){
                    index++;
                    continue;
                }else{
                    if(saveArr[1] < todayArr[1]){
                        list.add(index++);
                        continue;
                    }else if(saveArr[1] > todayArr[1]){
                        index++;
                        continue;
                    }else{
                        if(saveArr[2] <= todayArr[2]){
                            list.add(index++);
                            continue;
                        }else{
                            index++;
                            continue;
                        }
                    }
                }

            }
            int[] answer = new int[list.size()];
            for(int i = 0; i<list.size(); i++){
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}
