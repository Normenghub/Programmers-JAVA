package 연습;

import java.util.*;
public class 둘만의암호 {

    class Solution {
        public String solution(String s, String skip, int index) {
            String answer ="";
            Character c;
            HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
            for(int i = 0; i<skip.length(); i++){
                if(!map.containsKey((int) skip.charAt(i))){
                    map.put((int) skip.charAt(i),true);
                }
            }
            for(int i =0; i< s.length(); i++){
                c = changeChar(s.charAt(i),index,map);
                answer += c.toString();
            }
            System.out.println(map);
            return answer;
        }

        static Character changeChar(Character character, int index, HashMap<Integer, Boolean> map){
            int count = 0;
            int charNum = (int) character;
            while(count!=index){
                charNum++;
                charNum = overNum(charNum);
                if(!map.containsKey(charNum)){
                    count++;
                }
            }
            return (char) charNum;

        }
        static int overNum(int num){
            if(num == 123){
                return num-26;
            }
            return num;
        }
    }
}
