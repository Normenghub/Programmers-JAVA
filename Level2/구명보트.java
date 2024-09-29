package Level2;
import java.util.*;

public class 구명보트 {
    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;
            Deque<Integer> q = new ArrayDeque();
            Arrays.sort(people);
            for(int data : people){
                q.addLast(data);
            }
            while(true){
                if(q.size() == 1 || q.size() ==0) break;
                if(q.getFirst() + q.getLast() <= limit){
                    q.removeLast();
                    q.removeFirst();
                    answer++;
                }else{
                    q.removeLast();
                    answer++;
                }
            }
            if(q.size() == 1) answer++;
            return answer;
        }
    }
}
