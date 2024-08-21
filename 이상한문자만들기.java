public class 이상한문자만들기 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            int count =0;
            for(int i = 0; i < s.length(); i ++){
                if(s.charAt(i) == ' '){
                    answer += ' ';
                    count = 0;

                    continue;
                }else if (count % 2 != 0){
                    answer += Character.toLowerCase(s.charAt(i));
                    count++;
                }else if (count % 2 == 0){
                    answer += Character.toUpperCase(s.charAt(i));
                    count++;
                }
            }
            return answer;
        }
    }
}
