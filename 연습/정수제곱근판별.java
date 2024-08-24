package 연습;

import java.util.*;
public class 정수제곱근판별 {
    class Solution {
        public long solution(long n) {
            double a = Math.sqrt(n);
            Long x = (long) a;
            if((long)x * x != n){
                return -1;
            }else{
                return (long) (x+1) * (x+1);
            }

        }
    }
}
