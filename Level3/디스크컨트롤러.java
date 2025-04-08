package Level3;
import java.util.*;
public class 디스크컨트롤러 {

    class Solution {
        public int solution(int[][] jobs) {
            Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));

            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
            int time = 0;
            int index = 0;
            int total = 0;
            int count = 0;

            while (count < jobs.length) {
                while (index < jobs.length && jobs[index][0] <= time) {
                    pq.add(jobs[index++]);
                }

                if (pq.isEmpty()) {
                    time = jobs[index][0];
                } else {
                    int[] job = pq.poll();
                    time += job[1];
                    total += time - job[0];
                    count++;
                }
            }

            return total / jobs.length;
        }
    }
}
