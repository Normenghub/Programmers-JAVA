public class 문자열다루기기본 {
    class Solution {
        public boolean solution(String s) {
            if(s.length() ==4 || s.length() == 6){
                for(int i = 0; i<s.length(); i++){
                    int charInt = (int) s.charAt(i) -'0';
                    if(charInt <=9 && charInt >=0){
                        continue;
                    }else{
                        return false;
                    }

                }
                return true;
            }else{
                return false;
            }
        }
    }
}
