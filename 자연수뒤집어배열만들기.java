public class 자연수뒤집어배열만들기 {
    class Solution {
        public int[] solution(long n) {
            int[] answer;
            String number = Long.toString(n);
            answer = new int[number.length()];
            int index = 0;
            for(int i = number.length()-1; i>=0; i--){
                answer[index++] = Integer.parseInt(Character.toString(number.charAt(i)));
            }
            return answer;
        }
    }
}
