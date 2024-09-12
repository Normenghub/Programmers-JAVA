package 연습;
import java.util.*;
public class 햄버거만들기 {
    class Solution {
        public int solution(int[] ingredient) {
            int answer = 0;
            Deque<Integer> stack = new ArrayDeque<>();
            Deque<Integer> saveStack = new ArrayDeque<>();
            int[] correct = {1,2,3,1};

            for(int material : ingredient){
                if(stack.size() <3){
                    stack.add(material);
                }else{
                    stack.add(material);
                    if(stack.getLast() == 1){
                        for(int i = 0; i<4; i++){
                            saveStack.addFirst(stack.pollLast());
                        }

                        int index = 0;
                        boolean flag = true;
                        for(int data : saveStack){
                            if(data == correct[index++]){continue;}else{
                                flag = false;
                                break;
                            }}
                        if(flag){
                            saveStack.clear();
                            answer++;
                            index=0;
                        }else{
                            for(int z : saveStack){
                                stack.addLast(z);
                            }
                            index=0;
                        }
                        saveStack.clear();
                    }}}
            return answer;
        }}}
