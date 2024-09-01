package 연습;
import java.util.*;
public   class 실패율 {
    class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
            int portion = stages.length;
            HashMap<Integer,Integer> map = new HashMap();
            HashMap<Integer,Double> score = new HashMap();

            for(int i =1; i <=501; i++){
                map.put(i,0);
            }
            for(int i = 0; i< stages.length; i++){
                map.put(stages[i],map.get(stages[i]) + 1);
            }
            for (int i = 1; i <= N; i++) {
                if (portion > 0) {
                    score.put(i, (double) map.get(i) / (double) portion);
                    portion -= map.get(i);
                } else {
                    score.put(i, 0.0);
                }
            }
            List<Map.Entry<Integer, Double>> list = new ArrayList<>(score.entrySet());

            list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i).getKey();
            }


            return answer;
        }
    }
}
