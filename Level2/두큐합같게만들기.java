package Level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class 두큐합같게만들기 {
    class Solution {
        public int solution(int[] queue1, int[] queue2) {
            int answer = 0;
            long sumQ1 = Arrays.stream(queue1).sum();
            long sumQ2 = Arrays.stream(queue2).sum();
            int len = queue1.length;
            Queue<Integer> q1 = Arrays.stream(queue1)
                    .boxed()
                    .collect(Collectors.toCollection(() -> new LinkedList<>()));
            Queue<Integer> q2 = Arrays.stream(queue2)
                    .boxed()
                    .collect(Collectors.toCollection(() -> new LinkedList<>()));

            while(sumQ1 != sumQ2){
                if(sumQ1 > sumQ2){
                    int ele = q1.poll();
                    q2.add(ele);
                    sumQ1-=ele;
                    sumQ2+=ele;
                    answer++;
                }else{
                    int ele = q2.poll();
                    q1.add(ele);
                    sumQ2-=ele;
                    sumQ1+=ele;
                    answer++;
                }
                if(answer > len * 4){
                    return -1;
                }

            }
            return answer;

        }
    }


}
