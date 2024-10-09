package Level2;
import java.util.*;
public class 프로세스 {

        class Solution {
            public int solution(int[] priorities, int location) {
                int answer = 0;
                Queue<int[]> q = new LinkedList<>();

                for (int i = 0; i < priorities.length; i++) {
                    q.offer(new int[] {i, priorities[i]});
                }

                while (!q.isEmpty()) {
                    int[] current = q.poll();
                    boolean isHighest = true;

                    for (int[] doc : q) {
                        if (doc[1] > current[1]) {
                            isHighest = false;
                            break;
                        }
                    }

                    if (isHighest) {
                        answer++;
                        if (current[0] == location) {
                            break;
                        }
                    } else {
                        q.offer(current);
                    }
                }

                return answer;
            }

    }
}
