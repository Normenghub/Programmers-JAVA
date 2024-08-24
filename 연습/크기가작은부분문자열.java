package 연습;

public class 크기가작은부분문자열 {
    class Solution {
        public int solution(String t, String p) {
            int answer = 0;
            String saveNum = "";
            for(int i = 0; i < t.length()-p.length()+1; i++){
                saveNum = "";
                for(int k = i; k < i + p.length(); k++){
                    saveNum += t.charAt(k);
                }

                if(Long.parseLong(saveNum) <= Long.parseLong(p)){               System.out.println();

                    answer ++;
                }
            }
            return answer;
        }
    }
}
