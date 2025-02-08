package Level2;

import java.util.*;
public class 더맵게 {
    class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;
            PriorityQueue<Integer> q = new PriorityQueue();
            for (Integer i : scoville){
                q.add(i);
            }

            while(true){
                if(q.size() == 1){
                    int mina = q.poll();
                    if(mina >= K){
                        break;
                    }else{
                        return -1;
                    }
                }
                int min1 = q.poll();
                int min2 = q.poll();
                int cal = min1 + (min2 * 2);
                if(min1 >= K){
                    break;
                }
                q.add(cal);
                answer++;
            }
            return answer;
        }
    }
}
