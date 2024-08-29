package 연습;
import java.util.*;
public class 기사단원의무기 {
    class Solution {
        public int solution(int number, int limit, int power) {
            int answer = 0;
            for(int i=1;i<=number;i++){
                boolean flag = false;
                ArrayList<Integer> list = new ArrayList<>();
                int sqrtNum = (int) Math.sqrt(i);
                for(int j=1;j<=sqrtNum;j++){
                    if(i % j == 0){
                        list.add(j);
                        if(list.size() > limit){
                            answer += power;
                            flag = true;
                            break;
                        }
                    }
                }
                if(flag){
                    continue;
                }
                int listSize = list.size();
                for(int j=0;j<listSize;j++){
                    if(i % list.get(j) == 0){
                        if(i/list.get(j) == list.get(j)){
                        }else if(i % list.get(j) == 0){
                            list.add(i/ list.get(j));
                        }
                    }
                }
                if(list.size() > limit){
                    answer += power;
                }else{
                    answer += list.size();
                }
            }

            System.out.println(answer);
            return answer;
        }
    }
}
