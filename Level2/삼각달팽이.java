package Level2;
import java.util.*;
public class 삼각달팽이 {
    class Solution {
        public int[] solution(int n) {
            ArrayList<Integer> list = new ArrayList();
            int[][] table = new int[n][n];
            int num  = 1;
            int y = 0;
            int x = -1;
            for(int i = 0; i< n; i++){
                for(int j = i; j<n; j++){
                    if(i % 3 == 0){
                        x++;
                    }else if(i % 3 == 1){
                        y++;
                    }else{
                        y--;
                        x--;
                    }
                    table[x][y] = num++;
                }

            }
            for(int i = 0; i< n; i++){
                for(int j = 0; j< n; j++){
                    if(table[i][j] ==0) break;
                    list.add(table[i][j]);
                }
            }
            int[] answer = new int[list.size()];
            for(int i = 0 ; i< list.size(); i++){ answer[i] = list.get(i);}

            return answer;
        }
    }
}
