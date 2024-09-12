package 연습;
import java.util.*;
public class 체육복 {
    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = n-lost.length;
            Arrays.sort(lost);
            Arrays.sort(reserve);
            HashMap<Integer,Boolean> check = new HashMap();
            HashMap<Integer,Boolean> mapLost = new HashMap<>();
            HashMap<Integer,Boolean> mapReserve = new HashMap<>();
            ArrayList<Integer> reserveList = new ArrayList<>();
            ArrayList<Integer> lostList = new ArrayList<>();
            for(int data : lost){
                mapLost.put(data,true);
            }
            for(int data : reserve){
                mapReserve.put(data,true);
            }
            for(int data : lost){
                if(!mapReserve.containsKey(data)){
                    lostList.add(data);
                }
            }
            for(int data: reserve){
                if(!mapLost.containsKey(data)){
                    reserveList.add(data);
                }else{
                    answer++;
                }
            }
            for(int data : reserveList){
                for(int data2 : lostList){
                    if(check.containsKey(data2)){
                        continue;
                    }
                    if(data + 1 == data2 || data -1 == data2){
                        check.put(data2,true);
                        answer ++;
                        break;
                    }

                }

            }





            return answer;
        }
    }
}