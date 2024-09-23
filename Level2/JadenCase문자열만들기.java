package Level2;

public class JadenCase문자열만들기 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            boolean flag = true;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' '){
                    answer+=" ";
                    flag=true;
                    continue;
                }
                if(flag){
                    answer += Character.toString(s.charAt(i)).toUpperCase();
                    flag = false;
                }else{
                    answer += Character.toString(s.charAt(i)).toLowerCase();
                }

            }
            return answer;
        }
    }
}
