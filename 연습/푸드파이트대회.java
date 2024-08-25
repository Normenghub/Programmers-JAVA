package 연습;

public class 푸드파이트대회 {
    class Solution {
        public String solution(int[] food) {
            String str = "";
            String save = "";
            for(int i = 1; i<food.length; i++){
                for(int k = 0; k<food[i]/2; k++){
                    str += Integer.toString(i);
                }
            }
            for(int i = str.length()-1; i>=0; i--){
                save += str.charAt(i);
            }
            str+="0";
            str +=save;

            return str;
        }
    }
}
