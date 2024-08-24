package 연습;

public class 자릿수더하기 {
    public class Solution {
        public int solution(int n) {
            int answer = 0;
            String str = Integer.toString(n);
            for(int i = 0; i<str.length(); i++){
                answer += Integer.parseInt(Character.toString(str.charAt(i)));
            }

            return answer;
        }
    }
}
