package Level2;
// 인덱스 계산
public class n곱하기n배열자르기 {
    class Solution {
        public int[] solution(int n, long left, long right) {
            int[] answer = new int[ (int) (right - left +1l)];
            int index = 0;
            int start = (int)((left)/ (long)n);
            int end = (int)((right) /(long) n);

            for(int i = start; i<=end; i++){
                if(start == i){
                    for(int k = ((int) left - (n * start)) ; k<n; k++){
                        if(index == answer.length) break;
                        if(i < k) answer[index++] = k+1;
                        else answer[index++] = i+1;
                    }

                }else if(i == end){
                    for(int k = 0; k<n; k++){
                        if(index == answer.length) break;
                        if(i < k) answer[index++] = k+1;
                        else answer[index++] = i+1;
                    }
                }else{
                    for(int k = 0; k<n; k++){
                        if(index == answer.length) break;
                        if(i < k) answer[index++] = k+1;
                        else answer[index++] = i+1;
                    }

                }
            }
            return answer;
        }
    }
}
