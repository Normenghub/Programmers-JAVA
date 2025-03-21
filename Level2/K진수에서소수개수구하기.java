package Level2;

import java.util.*;

public class K진수에서소수개수구하기 {

    class Solution {
        public int solution(int n, int k) {
            int answer = 0;
            String converted = Integer.toString(n,k);
            String[] numbers = converted.split("0");
            for(String num : numbers){
                if(!num.isEmpty()){
                    if(isPrime(Long.parseLong(num))){
                        answer++;
                    }
                }
            }


            return answer;
        }
        private static boolean isPrime(long num) {
            if (num < 2) return false;
            if (num == 2) return true;
            if (num % 2 == 0) return false;

            for (long i = 3; i * i <= num; i += 2) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }
}
