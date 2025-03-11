package Level3;
public class 등굣길 {
    class Solution {
        static final int MOD = 1000000007;
        public int solution(int m, int n, int[][] puddles) {
            int answer = 0;
            int[][] dp = new int[n][m];
            boolean[][] puddleMap = new boolean[n][m];

            for(int[] puddle : puddles){
                puddleMap[puddle[1]-1][puddle[0]-1] = true;
            }
            dp[0][0] = 1;
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    if (puddleMap[y][x]) {
                        dp[y][x] = 0;  // 웅덩이는 이동 불가
                        continue;
                    }

                    if (y > 0) dp[y][x] = (dp[y][x] + dp[y - 1][x]) % MOD; // 위쪽에서 오는 경우
                    if (x > 0) dp[y][x] = (dp[y][x] + dp[y][x - 1]) % MOD; // 왼쪽에서 오는 경우
                }
            }

            return dp[n-1][m-1];
        }
    }
}
