package Level2;
import java.util.*;
public class One차캐시 {
    class Solution {
        public int solution(int cacheSize, String[] cities) {
            if (cacheSize == 0) return 5 * cities.length;

            int answer = 0;
            LinkedList<String> cache = new LinkedList<>();

            for (String city : cities) {
                city = city.toLowerCase();

                if (cache.contains(city)) {
                    cache.remove(city);
                    cache.addFirst(city);
                    answer += 1;
                } else {
                    if (cache.size() == cacheSize) {
                        cache.removeLast();
                    }
                    cache.addFirst(city);
                    answer += 5;
                }
            }

            return answer;
        }
    }
}
