import java.util.*;

public class 같은숫자는싫어 {
    public class Solution {
        public int[] solution(int []arr) {
            int[] answer = {};
            ArrayList<Integer> list = new ArrayList();
            int present = -1;
            for(int i = 0; i<arr.length; i++){
                if(present == -1){
                    list.add(arr[i]);
                    present = arr[i];
                }else if(present == arr[i]){
                    continue;
                }else{
                    list.add(arr[i]);
                    present=arr[i];
                }
            }
            answer = new int[list.size()];
            for(int i =0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
