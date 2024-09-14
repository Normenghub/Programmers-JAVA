package Level3;
import java.util.*;
public class 가장먼노드 {
    class Solution {
        static HashMap<Integer,ArrayList<Integer>> map = new HashMap();
        public int solution(int n, int[][] vertex) {
            int answer = 0;
            int[] visited = new int[n+1];
            for(int i = 1; i <=n; i++){
                map.put(i,new ArrayList<Integer>());
            }
            for(int i =0; i< vertex.length; i++){
                map.get(vertex[i][0]).add(vertex[i][1]);
                map.get(vertex[i][1]).add(vertex[i][0]);
            }
            dfs(1,visited);
            answer = findResult(findMaxNum(visited),visited);

            return answer;
        }
        static void dfs(int start,int[] visited){
            for(int data : map.get(start)){
                if(data != 1 && visited[data] == 0){
                    visited[data] = visited[start] + 1;
                    dfs(data,visited);
                }else if( data != 1 && visited[data] > visited[start] + 1){
                    visited[data] = visited[start] + 1;
                    dfs(data,visited);
                }
            }

        }
        static int findMaxNum(int[] visited){
            int maxNum = -1;
            for(int data : visited){
                if(maxNum < data) maxNum = data;
            }
            return maxNum;
        }
        static int findResult(int targetNum,int[] visited){
            int result = 0;
            for(int data : visited){
                if(targetNum == data){
                    result++;
                }
            }
            return result;
        }

    }
}
