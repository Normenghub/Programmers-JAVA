package 연습;

import java.time.*;
public class 이천십육년 {
    class Solution {
        public String solution(int a, int b) {
            return Year.of(2016).atMonth(a).atDay(b).getDayOfWeek().toString().substring(0,3);
        }
    }
}
