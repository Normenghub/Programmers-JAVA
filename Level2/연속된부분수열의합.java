package Level2;

public class 연속된부분수열의합 {
    class Solution {
        public int[] solution(int[] sequence, int k) {
            int[] answer = {-1, -1};
            int arrSum = sequence[0];
            int minLength = Integer.MAX_VALUE;
            int start = 0;
            int end = 0;
            while(start <= end && end < sequence.length){
                if(arrSum < k){
                    if (++end < sequence.length) arrSum += sequence[end];
                }else if(arrSum > k){
                    arrSum-=sequence[start++];
                }else{
                    if(minLength > end-start){
                        minLength = end - start;
                        answer[0] = start;
                        answer[1] = end;
                    }
                    arrSum -= sequence[start++];
                }
            }
            return answer;
        }
    }
}
