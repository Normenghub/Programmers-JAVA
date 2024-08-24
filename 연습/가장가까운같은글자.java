package 연습;

public class 가장가까운같은글자 {
    class Solution {
        public int[] solution(String s) {
            int[] alphabet = new int[26];
            for(int i= 0; i < alphabet.length; i++){
                alphabet[i] = -1;
            }
            int[] answer = new int[s.length()];
            for(int i = 0; i< s.length(); i++){
                if(alphabet[(int) s.charAt(i) - 'a'] == -1){
                    answer[i] = -1;
                    alphabet[(int) s.charAt(i) - 'a'] = i;
                }else{
                    answer[i] = i - alphabet[(int) s.charAt(i) - 'a'];
                    alphabet[(int) s.charAt(i) - 'a'] = i;
                }
            }
            return answer;
        }
    }
}
