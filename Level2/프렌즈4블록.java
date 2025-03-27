package Level2;
import java.util.*;
public class 프렌즈4블록 {
    class Solution {
        static int answer = 0;
        static boolean flag = true;
        public int solution(int m, int n, String[] board) {

            String[][] map = new String[m][n];
            setMap(map,board);
            while(flag){
                countScore(map);
            }


            return answer;
        }
        private static void setMap(String[][] map, String[] board){
            for(int j = 0; j<board.length; j++){
                String[] element = board[j].split("");
                for(int i = 0; i < element.length; i++){
                    map[j][i] = element[i];
                }
            }
        }
        private static void countScore(String[][] map){
            Queue<int[]> q = new LinkedList();
            int count = 0;
            for(int i = 0; i< map.length-1;i++){
                for(int j = 0; j< map[0].length-1; j++){
                    if(map[i][j] != "BB" && map[i][j].equals(map[i][j+1]) && map[i][j+1].equals(map[i+1][j+1]) && map[i+1][j+1].equals(map[i+1][j])){

                        q.add(new int[]{i,j});
                        q.add(new int[]{i+1,j});
                        q.add(new int[]{i,j+1});
                        q.add(new int[]{i+1,j+1});
                        count+=1;
                    }
                }
            }
            if(count != 0){
                removeBlock(map,q);
            }else{ flag = false;}


        }
        private static void removeBlock(String[][] map, Queue<int[]> queue){
            while(!queue.isEmpty()){
                int[] elements = queue.poll();
                if(!map[elements[0]][elements[1]].equals("BB")){
                    answer++;
                    map[elements[0]][elements[1]] = "BB";
                }
            }
            renewMap(map);

        }
        private static void renewMap(String[][]map){
            for(int i = 0; i<map[0].length; i++){
                ArrayList<String> list = new ArrayList();
                for(int j = map.length-1; j>=0; j--){
                    if(!map[j][i].equals("BB")){
                        list.add(map[j][i]);
                    }
                }
                int index = 0;
                for(int k = map.length-1; k> map.length-1-list.size(); k--){
                    map[k][i] = list.get(index++);
                }
                for(int k = map.length-1-list.size(); k>=0; k--){map[k][i] = "BB";}
            }

        }

    }

}
