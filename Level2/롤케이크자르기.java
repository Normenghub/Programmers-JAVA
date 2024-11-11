package Level2;

import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer,Integer> userOne = new HashMap();
        HashMap<Integer,Integer> userTwo = new HashMap();
        for(int data : topping){
            if(userTwo.containsKey(data)) userTwo.put(data,userTwo.get(data)+1);
            else userTwo.put(data,1);
        }
        for(int data :topping){
            userTwo.put(data,userTwo.get(data)-1);
            if(userTwo.get(data) == 0)  userTwo.remove(data);

            if(userOne.containsKey(data))  userOne.put(data,userOne.get(data) + 1);
            else userOne.put(data,1);
            if(userOne.size() == userTwo.size()){
                answer++;
            }else if(userOne.size() > userTwo.size()){
                break;
            }

        }
        return answer;
    }
}
