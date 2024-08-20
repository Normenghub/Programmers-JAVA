import java.util.*;

public class 문자열내림차순으로배치하기 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            ArrayList<Integer> list = new ArrayList();
            for(int i = 0; i< s.length(); i++){
                list.add((int)s.charAt(i));
            }
            Collections.sort(list, Collections.reverseOrder());
            for(int data:list){
                answer += (char) data;
            }

            return answer;
        }
    }
}
