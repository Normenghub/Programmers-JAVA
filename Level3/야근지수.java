package Level3;
import java.util.*;
public class 야근지수{
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue();
        for(Integer data : works){
            maxHeap.add(-data);
        }
        for(int i = 0; i <n; i++){
            int num = maxHeap.poll();
            if(num+1 !=0){
                maxHeap.add(num+1);
            }
            if(maxHeap.size() == 0) break;
        }
        while(!maxHeap.isEmpty()){
            int num = maxHeap.poll();
            answer += (num)*(num);
        }
        return answer;
    }
}

}
