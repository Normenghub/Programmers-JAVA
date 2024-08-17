import java.util.*;
public class 평균구하기 {
    class Solution {
        public double solution(int[] arr) {
            int sumValue = Arrays.stream(arr).sum();
            return (double) sumValue / arr.length;
        }
    }
}
