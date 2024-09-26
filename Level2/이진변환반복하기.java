package Level2;

public class 이진변환반복하기 {
    class Solution {
        public int[] solution(String s) {
            int[] answer = new int [2];
            while(!s.equals("1")){
                String str = "";
                for(int i =0; i<s.length(); i++){
                    if(s.charAt(i) == '0') answer[1]++;
                    else str += "1";

                }
                int leng = str.length();
                s = Integer.toBinaryString(leng);
                answer[0]++;

            }

            return answer;
        }
    }
}
