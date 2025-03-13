package Level3;
import java.util.*;
public class 보석쇼핑 {

    class Solution {
        public int[] solution(String[] gems) {
            HashMap<String, Integer> map = new HashMap<>();
            for (String gem : gems) {
                map.put(gem, 0);
            }

            int gemsCount = 0;
            int totalGems = map.size();
            int[] answer = {0, gems.length - 1};
            int start = 0;
            int end = 0;

            while (end < gems.length) {
                if (map.get(gems[end]) == 0) {
                    gemsCount++;
                }
                map.put(gems[end], map.get(gems[end]) + 1);
                end++;
                while (gemsCount == totalGems) {
                    if (end - start - 1 < answer[1] - answer[0]) {
                        answer[0] = start;
                        answer[1] = end - 1;
                    }

                    map.put(gems[start], map.get(gems[start]) - 1);
                    if (map.get(gems[start]) == 0) {
                        gemsCount--;
                    }
                    start++;
                }
            }

            answer[0]++;
            answer[1]++;
            return answer;
        }
    }
}
