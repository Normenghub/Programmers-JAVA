package 연습;
import java.util.*;
public class 폰켓몬 {
    class Solution {
        public int solution(int[] nums) {
            HashMap <Integer, Integer> map = new HashMap<>();

            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }else{
                    map.put(nums[i],1);
                }
            }
            if(map.size() <= nums.length/2){
                return map.size();
            }else{
                return nums.length/2;
            }
        }
    }
}
