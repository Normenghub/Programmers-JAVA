package 연습;
import java.util.*;
public class 대충만든자판 {
    class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];
            int index = 0;
            HashMap<Character,Integer> map = new HashMap();
            for(int i = 0; i < targets.length; i++){
                boolean flag = true;
                int count = 0;
                int countMin = 1001;
                for(int k = 0; k < targets[i].length(); k++){ //ABCD
                    Character targetChar = targets[i].charAt(k);
                    if(map.containsKey(targetChar)){
                        count+= map.get(targetChar);
                        continue;
                    }
                    countMin = 1001;
                    for(int j = 0; j < keymap.length; j++){
                        for(int z = 0; z< keymap[j].length(); z++){
                            if(targetChar == keymap[j].charAt(z)){
                                if(countMin > z+1){
                                    countMin = z+1;
                                    break;}}}}
                    if(countMin == 1001){
                        flag = false;
                        continue;}
                    map.put(targetChar,countMin);
                    count+=countMin;}
                if(!flag){
                    answer[index++] = -1;}else{
                    answer[index++] = count;}
            }
            return answer;
        }}}
