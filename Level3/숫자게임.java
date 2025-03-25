package Level3;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 숫자게임 {
    class Solution {
        public int solution(int[] A, int[] B) {
            int answer = 0;
            List<Integer> list = IntStream.of(B).boxed().collect(Collectors.toList());
            List<Integer> targetList = IntStream.of(A).boxed().collect(Collectors.toList());
            Collections.sort(list);
            Collections.sort(targetList);
            int index = 0;
            for(int i = 0; i< list.size(); i++){
                if(targetList.get(index) < list.get(i)){
                    answer++;
                    index++;
                }
            }

            return answer;
        }
    }
}
