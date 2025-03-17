package Level2;
import java.util.*;

public class 숫자변환하기 {
    class Solution {
        public int solution(int x, int y, int n) {
            if(x == y) return 0;
            int[] table = new int[y+1];
            boolean[] visited = new boolean[y+1];
            Queue<Integer> q = new LinkedList();
            q.add(x);

            while(!q.isEmpty()){
                int num = q.poll();
                for(int i = 0; i< 3; i++){
                    int save = num;
                    if(i == 0) save *=2;
                    else if(i == 1) save *=3;
                    else save += n;
                    if(save > y) continue;
                    if(!visited[save]){
                        table[save] = table[num] + 1;
                        visited[save] = true;
                        q.add(save);
                    }else if(table[save] > table[num] + 1){
                        table[save] = table[num] + 1;
                        q.add(save);
                    }
                }
            }
            if(table[y] == 0) return -1;
            return table[y];


        }



    }
}
