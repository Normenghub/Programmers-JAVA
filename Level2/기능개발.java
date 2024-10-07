package Level2;
import java.util.*;

public class 기능개발 {
    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            ArrayList<Integer> list = new ArrayList();
            Deque<Integer> q = new ArrayDeque();
            Deque<Integer> speedsSave = new ArrayDeque();
            for(int i = 0; i<speeds.length; i++){
                q.addLast(progresses[i]);
                speedsSave.addLast(speeds[i]);
            }
            for(int i = 1; i < 9999; i++){
                int result = 0;
                while(true){
                    if(q.getFirst()  + (speedsSave.getFirst() * i)>= 100){
                        q.removeFirst();
                        speedsSave.removeFirst();
                        result++;
                    }else{
                        break;
                    }
                    if(q.size() == 0) break;
                }

                if(result != 0) list.add(result);
                if(q.size() == 0) break;
            }
            int[] answer = new int[list.size()];
            for(int i = 0 ; i<list.size(); i++) answer[i] = list.get(i);
            return answer;
        }
    }
}
