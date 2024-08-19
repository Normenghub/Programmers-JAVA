public class 수박수박수박수박수박수 {
    class Solution {
        public String solution(int n) {
            String answer = "";
            int index = 0;
            while(true){
                index++;
                answer += "수";
                if(index == n){
                    break;
                }
                index++;
                answer +="박";
                if(index == n){
                    break;
                }
            }
            return answer;
        }
    }
}
