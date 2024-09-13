package 연습;
import java.util.*;
// 모듈화 시키면 더 코드 길이가 짧아질듯
public class 키패드누르기 {
    class Solution {
        static String[][] keypads = {{"1","2","3"},{"4","5","6"},{"7","8","9"},{"*","0","#"}};
        static int[][] direction ={{1,0},{-1,0},{0,1},{0,-1}};
        public String solution(int[] numbers, String hand) {
            String answer = "";
            int[] left = {3,0};
            int[] right = {3,2};
            for(int number : numbers){
                if(number == 1){
                    answer += "L";
                    left[0] = 0;
                    left[1] = 0;
                }else if(number == 4){
                    answer += "L";
                    left[0] = 1;
                    left[1] = 0;
                }else if(number == 7){
                    answer += "L";
                    left[0] = 2;
                    left[1] = 0;
                }else if(number == 3){
                    answer += "R";
                    right[0] = 0;
                    right[1] = 2;
                }else if(number == 6){
                    answer += "R";
                    right[0] = 1;
                    right[1] = 2;
                }else if(number == 9){
                    answer += "R";
                    right[0] = 2;
                    right[1] = 2;

                }else{
                    if(number == 2){
                        int leftCount = bfs(0,1,left[0],left[1]);
                        int rightCount = bfs(0,1,right[0],right[1]);
                        if(leftCount == rightCount){
                            if(hand.equals("left")){
                                answer+="L";
                                left[0] = 0;
                                left[1] = 1;
                            }else{
                                answer+="R";
                                right[0] = 0;
                                right[1] = 1;
                            }
                        }else if(leftCount > rightCount){
                            answer+="R";
                            right[0] = 0;
                            right[1] = 1;
                        }else {
                            answer+="L";
                            left[0] = 0;
                            left[1] = 1;
                        }
                    }else if(number == 5){
                        int leftCount = bfs(1,1,left[0],left[1]);
                        int rightCount = bfs(1,1,right[0],right[1]);
                        if(leftCount == rightCount){
                            if(hand.equals("left")){
                                answer+="L";
                                left[0] = 1;
                                left[1] = 1;
                            }else{
                                answer+="R";
                                right[0] = 1;
                                right[1] = 1;
                            }
                        }else if(leftCount > rightCount){
                            answer+="R";
                            right[0] = 1;
                            right[1] = 1;
                        }else {
                            answer+="L";
                            left[0] = 1;
                            left[1] = 1;
                        }
                    }else if(number == 8){
                        int leftCount = bfs(2,1,left[0],left[1]);
                        int rightCount = bfs(2,1,right[0],right[1]);
                        if(leftCount == rightCount){
                            if(hand.equals("left")){
                                answer+="L";
                                left[0] = 2;
                                left[1] = 1;
                            }else{
                                answer+="R";
                                right[0] = 2;
                                right[1] = 1;
                            }
                        }else if(leftCount > rightCount){
                            answer+="R";
                            right[0] = 2;
                            right[1] = 1;
                        }else {
                            answer+="L";
                            left[0] = 2;
                            left[1] = 1;
                        }
                    }else if(number == 0){
                        int leftCount = bfs(3,1,left[0],left[1]);
                        int rightCount = bfs(3,1,right[0],right[1]);
                        if(leftCount == rightCount){
                            if(hand.equals("left")){
                                answer+="L";
                                left[0] = 3;
                                left[1] = 1;
                            }else{
                                answer+="R";
                                right[0] = 3;
                                right[1] = 1;
                            }
                        }else if(leftCount > rightCount){
                            answer+="R";
                            right[0] = 3;
                            right[1] = 1;
                        }else {
                            answer+="L";
                            left[0] = 3;
                            left[1] = 1;
                        }
                    }
                }
            }
            return answer;
        }
        static int bfs(int y,int x,int py, int px){
            int[][] visited = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
            Deque<int[]> queue = new ArrayDeque();
            queue.add(new int[]{y,x});
            visited[y][x] = 0;
            while(queue.size() != 0){
                int[] a = queue.removeFirst();
                for(int[] yx : direction){
                    int dy = yx[0] + a[0];
                    int dx = a[1] + yx[1];
                    if(outLines(dy,dx) && visited[dy][dx] == -1){
                        visited[dy][dx] = visited[a[0]][a[1]] + 1;
                        queue.add(new int[]{dy,dx});
                    }else if(outLines(dy,dx) && visited[dy][dx]>visited[a[0]][a[1]] + 1){
                        visited[dy][dx] = visited[a[0]][a[1]] + 1;
                        queue.add(new int[]{dy,dx});
                    }
                }
            }

            return visited[py][px];
        }

        static boolean outLines(int y,int x){
            return (x >= 0 && x <= 2) && (y >= 0 && y <= 3);
        }
    }
}
