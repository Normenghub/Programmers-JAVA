package Level2;

import java.util.*;
public class 짝지어제거하기 {
    class Solution
    {
        public int solution(String s)
        {
            int answer = 0;

            Deque<Character> q = new ArrayDeque();

            for(int i = 0; i < s.length(); i++){

                if(q.size() == 0){
                    q.addLast(s.charAt(i));
                    continue;
                }
                if(q.peekLast() == s.charAt(i)){
                    q.removeLast();
                }
                else{
                    q.addLast(s.charAt(i));
                }

            }



            if(q.size() == 0) answer = 1;
            return answer;
        }
    }

}
