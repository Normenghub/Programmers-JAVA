package Level2;
import java.util.*;
public class 피로도 {
    class Solution {
        static int answer = 0;
        static int n,m;
        static int[] arr;
        static boolean[] visited;
        static ArrayList<int[]> list = new ArrayList();
        public int solution(int k, int[][] dungeons) {
            init(dungeons);
            permutaion(0);
            go(k,dungeons,list);
            return answer;
        }
        static void go(int k , int[][] dungeons, ArrayList<int[]> list){
            for(int i = 0; i<list.size(); i++){
                int count = 0;
                int value= k;
                boolean flag = true;

                for(int j = 0; j<list.get(i).length; j++){
                    if(value>= dungeons[list.get(i)[j]][0]){
                        value -=dungeons[list.get(i)[j]][1];
                        count++;
                    }else if (value < 0 || value < dungeons[list.get(i)[j]][0]){
                        if(answer < count) answer = count;
                        flag =false;
                        break;
                    }
                }
                if(flag){
                    if(answer < count) answer = count;
                }
            }
        }

        static void permutaion(int c){
            if(c == m){
                int[] copy = arr.clone();
                list.add(copy);
            }
            for(int i = 0; i<n; i++){
                if(!visited[i]){
                    visited[i] = true;
                    arr[c] = i;
                    permutaion(c + 1);
                    visited[i] = false;
                }
            }
        }
        static void init(int[][] dungeons){
            visited = new boolean[dungeons.length];
            arr = new int[dungeons.length];
            n = dungeons.length;
            m = dungeons.length;
        }



    }
}
