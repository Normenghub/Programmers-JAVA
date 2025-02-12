package Level2;

import java.util.*;
public class 가장큰수 {
    class Solution {
        public String solution(int[] numbers) {
            String answer = "";
            String[] strNumbers = new String[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                strNumbers[i] = Integer.toString(numbers[i]);
            }

            Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));
            for(int i = 0; i <strNumbers.length; i++){
                answer += strNumbers[i];
            }
            if(strNumbers[0].equals("0")) return "0";

            return answer;
        }
    }
}
