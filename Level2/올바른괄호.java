package Level2;
import java.util.*;

public class 올바른괄호 {
    class Solution {
        boolean solution(String s) {
            Deque<Character> q = new ArrayDeque();
            for(int i = 0; i< s.length(); i++){
                if(s.charAt(i) == '('){
                    q.addLast('(');
                }else{
                    if(q.size() == 0) return false;
                    if(q.getLast() == '('){
                        q.pop();
                    }
                }
            }
            if(q.size()>0){
                return false;
            }
            return true;
        }
    }
}
