package 연습;

import java.util.*;

public class 두정수사이의합 {
    class Solution {
        public long solution(int a, int b) {
            long answer = 0;
            int[] arr = {a,b};
            Arrays.sort(arr);
            if(a==b){
                return a;
            }
            for(int i= arr[0]; i <=arr[1]; i++){
                answer += (long) i;
            }
            return answer;
        }
    }
}
