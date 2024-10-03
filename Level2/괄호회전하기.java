package Level2;
import java.util.*;
public class 괄호회전하기 {
    class Solution {
        public int solution(String s) {
            int answer = 0;
            Deque<String> queue = new ArrayDeque();
            for(int i = 0; i<s.length(); i++) queue.addLast(Character.toString(s.charAt(i)));
            for(int i = 0; i<s.length(); i++){
                Deque<String> q = new ArrayDeque(queue);
                if(ps(q)) answer++;

                queue.addLast(queue.pollFirst());
            }


            return answer;
        }
        static boolean ps(Deque<String> q){
            Deque<String> stack = new ArrayDeque();
            for(String data : q){
                if(stack.isEmpty()){
                    stack.addLast(data);
                    continue;
                }

                if(data.equals("}") && stack.getLast().equals("{")){
                    stack.removeLast();
                    continue;
                }else if(data.equals(")") && stack.getLast().equals("(")){
                    stack.removeLast();
                    continue;
                }else if(data.equals("]") && stack.getLast().equals("[")){
                    stack.removeLast();
                    continue;
                }

                stack.addLast(data);
            }

            if(stack.isEmpty()) return true;
            else return false;

        }


    }
}
