public class 하샤드수 {
    class Solution {
        public boolean solution(int x) {
            String number = String.valueOf(x);
            int sumValue = 0;
            for(int i= 0; i< number.length(); i++){
                sumValue += (int) number.charAt(i) - '0';
            }
            if(x % sumValue == 0){
                return true;
            }
            return false;
        }
    }
}
