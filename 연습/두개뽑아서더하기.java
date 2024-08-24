package 연습;
import java.util.*;

public class 두개뽑아서더하기 {
    class Solution {
        public int[] solution(int[] numbers) {
            int[] sum = new int[205];
            for(int i= 0; i < numbers.length-1; i++){
                for(int k =i+1; k < numbers.length; k++){
                    sum[numbers[i] + numbers[k]]++;
                }
            }
            ArrayList<Integer> list = new ArrayList();
            for(int i = 0; i<sum.length; i++){
                if(sum[i] > 0){

                    list.add(i);
                }
            }

            int[] answer = new int[list.size()];
            for(int i = 0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
