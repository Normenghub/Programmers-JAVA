package Level2;
import java.util.*;
public class One차뉴스클러스터링 {
    class Solution {
        public int solution(String str1, String str2) {
            HashMap<String,Integer> str1Map = setMap(str1);
            HashMap<String,Integer> str2Map = setMap(str2);
            int numerator = 0;
            int denominator = 0;
            int answer=0;
            for(String data: str1Map.keySet()){
                if(!str2Map.containsKey(data)){
                    denominator += str1Map.get(data);
                }else{
                    if(str1Map.get(data) >= str2Map.get(data)){
                        numerator += str2Map.get(data);
                        denominator += str1Map.get(data);
                    }else{
                        numerator += str1Map.get(data);
                        denominator += str2Map.get(data);
                    }
                }
            }
            for(String data : str2Map.keySet()){
                if(!str1Map.containsKey(data)){
                    denominator += str2Map.get(data);
                }
            }
            if(denominator == 0 && numerator == 0){
                answer = 65536;
            }else{
                answer = (int)(numerator*65536/denominator);
            }

            return answer;
        }
        static HashMap<String,Integer> setMap(String str){
            HashMap<String,Integer> map = new HashMap();

            for(int i= 0; i<str.length()-1; i++){
                String x = "";
                x += str.charAt(i);
                x += str.charAt(i+1);
                boolean flag = true;
                for(int k =0; k<x.length(); k++){
                    if(((int) x.charAt(k) >= 97 && (int)x.charAt(k) <=122)||((int) x.charAt(k) >= 65 && (int)x.charAt(k) <=90)){}else{
                        flag= false;
                        break;
                    }

                }
                if(flag){
                    if(map.containsKey(x.toLowerCase())){
                        map.put(x.toLowerCase(),map.get(x.toLowerCase())+1);
                    }else{
                        map.put(x.toLowerCase(),1);
                    }
                }

            }
            return map;
        }
    }
}
