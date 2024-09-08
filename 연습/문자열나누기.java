package 연습;

public class 문자열나누기 {

    class Solution {
        public int solution(String s) {
            int answer = 0;
            String nowChar = "";
            int same = 0;
            int differ = 0;
            for(int i =0; i<s.length(); i++){
                if(nowChar.equals("")){
                    nowChar = s.substring(i,i+1);
                    same = 1;
                    continue;
                }
                if(nowChar.equals(s.substring(i,i+1))){
                    same++;
                }else{
                    differ++;
                }
                if(same==differ){
                    answer++;
                    nowChar="";
                    same = 0;
                    differ = 0;
                }

            }
            if(same != differ){
                answer++;
            }

            return answer;
        }
    }
}
