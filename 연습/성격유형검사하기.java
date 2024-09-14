package 연습;
import java.util.*;
public class 성격유형검사하기 {
    class Solution {
        static HashMap<String,Integer> map = new HashMap();
        public String solution(String[] survey, int[] choices) {
            String[][] arr = {{"R","T"},{"C","F"},{"J","M"},{"A","N"}};
            String answer = "";
            setMap();
            for(int i = 0; i<survey.length; i++){
                String str1 = Character.toString(survey[i].charAt(0));
                String str2 = Character.toString(survey[i].charAt(1));
                pushMap(str1,str2,choices[i]);
            }
            for(int i = 0; i < 4; i++){
                String str1 = arr[i][0];
                String str2 = arr[i][1];
                String x = setResult(str1,str2);
                answer+=x;
            }

            return answer;
        }
        static void pushMap(String str1, String str2, int num){
            if(num == 4){

            }else if(num >4){
                map.put(str2,map.get(str2) + num-4);
            }else{
                map.put(str1,map.get(str1) + ((num-4) * -1));
            }
        }
        static void setMap(){
            map.put("R",0);
            map.put("T",0);
            map.put("C",0);
            map.put("F",0);
            map.put("J",0);
            map.put("M",0);
            map.put("A",0);
            map.put("N",0);
        }
        static String setResult(String str1,String str2){
            if(map.get(str1) < map.get(str2)){
                return str2;
            }else{
                return str1;
            }
        }
    }
}
