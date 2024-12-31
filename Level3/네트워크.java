package Level3;

public class 네트워크 {
    class Solution {
        static Boolean[] visited;
        public int solution(int n, int[][] computers) {
            visited = new Boolean[n];
            for(int i = 0; i< visited.length; i ++){
                visited[i] = false;
            }

            int answer = 0;
            for(int i = 0; i<n; i++){
                if (visited[i])  continue;

                else{
                    dfs(visited,i,computers);
                    answer++;
                }
            }
            return answer;
        }
        private static void dfs(Boolean[] visited, int num, int[][] computers){
            visited[num] = true;
            for(int i = 0; i< computers[num].length; i++){
                if(computers[num][i] == 1 && !visited[i]){
                    dfs(visited,i,computers);
                }
            }
        }

    }






}
