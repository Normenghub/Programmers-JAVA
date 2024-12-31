package Level2;

public class Three차n진수게임 {
    public static void main(String[] args) {
        class Solution {
            public String solution(int n, int t, int m, int p) {
                String answer = "";
                int[] sequance = new int[t];
                for(int i = 0; i< t; i++){
                    sequance[i] = p + (m * i);
                }
                String data = "";
                for(int i = 0; i<=t * m; i++) data += Integer.toString(i,n);
                for(Integer k : sequance){
                    answer += data.substring(k-1,k);
                }

                return answer.toUpperCase();
            }
        }




    }
}
