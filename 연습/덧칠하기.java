package 연습;
import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean fl = false;
        int present,ig;
        
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for(int i = 0; i<section.length; i++){
            stack.add(section[i]);
        }
        while(stack.size() != 0){
            
            if(!fl){
                present = stack.getFirst();
                ig = stack.getFirst();
                while(true){
                    if(ig >= present && ig <= present+m-1){
                        stack.removeFirst();
                        if(stack.size()==0){
                            break;
                        }
                        ig = stack.getFirst();        
                    }else{
                        break;
                    }                  
                }
                
                fl = true;
                answer++;
            }else{
                present = stack.getLast();
                ig = stack.getLast();
             while(true){
                if(ig <= present && ig >= present-m+1){
                        stack.removeLast();
                        if(stack.size()==0){
                            break;
                        }
                     ig = stack.getLast();
                    }else{
                        break;
                    }
                 }
                fl = false;
                answer++;
        }
        }
        return answer;
    }
}
