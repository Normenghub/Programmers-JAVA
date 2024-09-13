package 연습;
import java.util.*;
public class 크레인인형뽑기 {
    class Solution {
        public int solution(int[][] board, int[] moves) {
            ArrayList<Integer> list= new ArrayList();
            int answer = 0;
            int item;
            for(int sequance : moves){
                int peek = peekUp(board,sequance-1);
                if(peek == 0){
                    continue;
                }else{
                    list.add(peek);
                }

                if(list.size() >=2){
                    if(checkSequance(list)){
                        list.remove(list.size()-1);
                        list.remove(list.size()-1);
                        answer+=2;
                    }else{

                    }
                }
            }
            return answer;
        }
        static int peekUp(int[][] board, int index){
            boolean flag = false;
            int peekItem = 0;
            for(int i = 0; i< board.length; i++){
                if(board[i][index] != 0){
                    peekItem = board[i][index];
                    board[i][index] = 0;
                    flag = true;
                    break;
                }
            }
            if(flag){
                return peekItem;
            }else{
                return 0;
            }

        }
        static boolean checkSequance(ArrayList<Integer> list){
            if(list.get(list.size()-1) == list.get(list.size()-2)){
                return true;
            }else{ return false;}
        }
    }
}
