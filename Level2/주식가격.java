package Level2;
import java.util.*;
public class 주식가격 {

    class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            Stack<int[]> stack = new Stack<>();
            for (int i = 0; i < prices.length; i++) {
                while (!stack.isEmpty() && stack.peek()[0] > prices[i]) {
                    int[] popped = stack.pop();
                    answer[popped[1]] = i - popped[1];
                }
                stack.push(new int[]{prices[i], i});
            }

            while (!stack.isEmpty()) {
                int[] popped = stack.pop();
                answer[popped[1]] = prices.length - 1 - popped[1];
            }

            return answer;
        }
    }
}
