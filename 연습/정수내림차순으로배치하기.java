package 연습;

import java.util.*;
public class 정수내림차순으로배치하기 {
    class Solution {
        public long solution(long n) {
            String answer = "";
            ArrayList<Integer> list = new ArrayList();
            String number = Long.toString(n);
            for(int i= 0; i<number.length(); i++){
                list.add(Integer.parseInt(Character.toString(number.charAt(i))));
            }
            Collections.sort(list, Collections.reverseOrder());
            System.out.println(list);
            for(Integer data : list){
                answer += Integer.toString(data);
            }

            return Long.parseLong(answer);
        }
    }
}
