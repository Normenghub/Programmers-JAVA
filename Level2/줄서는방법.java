package Level2;

import java.util.ArrayList;

public class 줄서는방법 {
    class Solution {
        public int[] solution(int n, long k) {
            k--;
            int index = 0;
            ArrayList<Integer> list = new ArrayList<>();
            int[] answer = new int[n];
            for(int i = 1; i <= n; i++){
                list.add(i);
            }
            while(!list.isEmpty()){
                long data = (k)/factorial(n-1);
                answer[index++] = list.get((int) data);
                list.remove(list.get((int)data));
                k = (k) %factorial(n-1);

                n--;
            }
            return answer;
        }
        private static long factorial(int n){
            long num = 1l;
            for(int i = 1; i <= n; i++){
                num *= i;
            }
            return num;
        }
    }
}
