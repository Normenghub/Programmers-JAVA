package Level2;
import java.util.*;
// BFS
public class 게임맵최단거리 {
    class Solution {
        static boolean result = false;
        public int solution(int[][] maps) {
            int answer= bfs(maps);
            if(!result){
                return -1;
            }else{
                return answer;
            }
        }
        static int bfs(int[][] maps){
            int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
            boolean[][] visited = new boolean[maps.length][maps[0].length];
            Deque<int[]> q = new ArrayDeque();
            q.addLast(new int[]{0,0});
            visited[0][0] = true;
            while(q.size()!=0){
                int[] arr = q.pollFirst();
                for(int[] dd : direction){
                    int dr = arr[0] + dd[0];
                    int dc = arr[1] + dd[1];
                    if(outLines(dr,dc,maps.length-1,maps[0].length-1) && !visited[dr][dc] && maps[dr][dc] == 1){
                        q.addLast(new int[]{dr,dc});
                        visited[dr][dc] = true;
                        maps[dr][dc] = maps[arr[0]][arr[1]] + 1;
                    }
                }

            }
            if(visited[maps.length-1][maps[0].length-1]){
                result = true;
            }


            return maps[maps.length-1][maps[0].length-1];
        }
        static boolean outLines(int r , int c, int maxr, int maxc){
            return (0 <= r && r <= maxr) && (0<= c && c<= maxc);
        }
    }
}
