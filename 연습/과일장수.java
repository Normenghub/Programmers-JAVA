package 연습;
import java.util.*;
public class 과일장수 {
    class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;
            ArrayList<Integer> list = new ArrayList<>();

            for(int data : score){
                list.add(data);
            }
            Collections.sort(list, Collections.reverseOrder());
            int counter = k+1;
            for(int i = 0; i < list.size(); i++){
                if(list.get(i) < counter){
                    counter = list.get(i);
                }
                if((i+1) % m == 0){
                    answer += counter * m;
                    counter = k+1;
                }
            }
            return answer;
        }
    }
}
