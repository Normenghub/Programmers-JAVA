package Level2;
import java.util.*;

import static java.lang.Math.*;
public class 주차요금계산 {


    class Solution {
        public int[] solution(int[] fees, String[] records) {
            HashMap<String , String> map = new HashMap();
            HashMap<String, Integer> save = new HashMap();
            for (String data : records) {
                String[] split = data.split(" ");
                if(!save.containsKey(split[1])) {
                    save.put(split[1],0);
                }

            }
            for (String data : records) {
                String[] split = data.split(" ");
                if(split[2].equals("IN")){
                    map.put(split[1],split[0]);
                }else{
                    int time = calTime(split[0],map.get(split[1]));
                    save.put(split[1], save.get(split[1])+time);
                    map.remove(split[1]);

                }

            }
            if(map.size() > 0){
                for( String key : map.keySet()){
                    int time = calTime("23:59", map.get(key));
                    save.put(key,save.get(key)+time);
                }
            }
            System.out.println(save);
            List<String> keys = new ArrayList<>(save.keySet());
            Collections.sort(keys);
            int[] answer = new int[save.size()];
            int cnt = 0;
            for(String data : keys){
                int asd;
                if(save.get(data) <= fees[0]){
                    answer[cnt] = fees[1];
                }else{
                    if((save.get(data)-fees[0]) % fees[2]> 0){
                        asd = (save.get(data) - fees[0]) / fees[2]+1;
                    }
                    else{
                        asd = (save.get(data) - fees[0]) / fees[2];
                    }
                    int result = fees[1] + asd * fees[3];

                    answer[cnt] = result;
                }

                cnt++;
            }


            return answer;
        }
        private static int calTime(String time1, String time2) {
            String[] split1 = time1.split(":");
            String[] split2 = time2.split(":");
            int hour = Integer.parseInt(split1[0]); // 출차 시각
            int minute = Integer.parseInt(split1[1]);
            int hour2 = Integer.parseInt(split2[0]); // 입차 시각
            int minute2 = Integer.parseInt(split2[1]);

            return ((abs(hour - hour2)) * 60) + ((minute - minute2));

        }
    }
}
