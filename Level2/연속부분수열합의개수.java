package Level2;
import java.util.*;
public class 연속부분수열합의개수 {
    class Solution {
        public int solution(int[] elements) {
            int answer = 0;
            int index = 0;
            int gap = 0;
            HashMap<Integer,Boolean> map = new HashMap();
            int[][] arr = new int[elements.length-1][elements.length];

            for(int i = 0; i < arr.length; i++){
                gap = index;
                for(int k = 0; k < arr[i].length; k++){
                    if(i == 0){
                        arr[i][k] = elements[k];
                        continue;
                    }

                    arr[i][k] = arr[i-1][k] + elements[gap++];
                    if(gap > elements.length-1) gap -=elements.length;


                }
                index++;
            }
            for(int i = 0; i < arr.length; i++){
                for(int k = 0; k<arr[i].length; k++){
                    if(!map.containsKey(arr[i][k])) map.put(arr[i][k],true);
                }
            }
            if(!map.containsKey(Arrays.stream(elements).sum())) map.put(Arrays.stream(elements).sum(),true);

            for(int data : map.keySet()) answer++;

            return answer;
        }
    }
}
