package Level2;
import java.util.*;
public class 다리를지나는트럭 {
    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            int time = 0;
            int totalWeight = 0;
            int index = 0;
            Queue<int[]> q = new LinkedList<>();
            while(true){
                ++time;
                if(q.isEmpty()){
                    totalWeight += truck_weights[index];
                    q.add(new int[]{truck_weights[index++],time});

                }else{
                    if(!q.isEmpty() && time - q.peek()[1] >= bridge_length){
                        int[] truck =  q.poll();
                        totalWeight-= truck[0];
                    }

                }
                if(index < truck_weights.length){
                    if(totalWeight + truck_weights[index] <= weight && q.size() + 1 <= bridge_length){
                        totalWeight += truck_weights[index];
                        q.add(new int[]{truck_weights[index++],time});
                    }
                }
                if(q.isEmpty() && index == truck_weights.length) break;
            }



            return time;
        }
    }
}
