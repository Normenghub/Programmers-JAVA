package 연습;

public class 시저암호 {
    class Solution {
        public String solution(String s, int n) {
            String answer = "";
            for(int i = 0; i<s.length(); i++){
                if(s.substring(i,i+1).equals(" ")){
                    answer +=" ";
                }else{
                    if((int) s.charAt(i) >= 65 &&
                            (int) s.charAt(i) <=90
                    ){
                        if(((int) s.charAt(i)) + n <=90){
                            answer += Character.toString((char) ((int) s.charAt(i)) + n);
                        }else{
                            answer += Character.toString((char) ((int) s.charAt(i)) + n - 26);
                        }

                    }else{
                        if(((int) s.charAt(i)) + n <=122){
                            answer += Character.toString((char) ((int) s.charAt(i)) + n);
                        }else{
                            answer += Character.toString((char) ((int) s.charAt(i)) + n - 26);
                        }
                    }
                }
            }
            return answer;
        }
    }
}
