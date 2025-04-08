package Level2;
import java.util.*;
public class 호텔대실 {
    class Solution {
        public int solution(String[][] book_time) {
            int answer = 0;
            PriorityQueue<int[]> pq = new PriorityQueue<>(
                    Comparator.<int[]>comparingInt(a -> a[0])
                            .thenComparingInt(a -> a[1])
            );
            for(String[] time : book_time){
                pq.add(new int[]{toMinutes(time[0]),toMinutes(time[1]) + 10});
            }
            PriorityQueue<Integer> q = new PriorityQueue();
            while(!pq.isEmpty()){
                int[] data = pq.poll();
                if(q.isEmpty()){
                    answer++;
                    q.add(data[1]);
                }else{
                    if(q.peek() > data[0]){
                        answer++;
                        q.add(data[1]);
                    }else{
                        q.poll();
                        q.add(data[1]);
                    }
                }

            }
            return answer;
        }
        private int toMinutes(String time) {
            int hour = Integer.parseInt(time.substring(0, 2));
            int min = Integer.parseInt(time.substring(3, 5));
            return hour * 60 + min;
        }
    }
}
