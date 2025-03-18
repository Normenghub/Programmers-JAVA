package Level2;
public class 큰수만들기 {
    class Solution {
        public String solution(String number, int k) {
            StringBuilder answer = new StringBuilder();

            int start = 0;
            int end = k;
            while(answer.length() != number.length()-k){
                int maxNum = -1;
                int saveStart = 0;
                for(int i = start; i<= end; i++){
                    int current = number.charAt(i) - '0';
                    if(maxNum < current){
                        maxNum = current;
                        saveStart = i;
                    }
                }
                answer.append( number.charAt(saveStart));
                end++;
                start = saveStart+1;
                if(number.length() -k -answer.length() == number.length() - start+1){
                    answer.append(number.substring(start,number.length()));
                }
            }

            return answer.toString();
        }
    }
}
