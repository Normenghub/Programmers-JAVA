import java.util.*;
public class Three진법뒤집기 {
    class Solution {
        public int solution(int num) {
            int answer = 0;
            String length = "";
            while(true){
                if(num<3){
                    length +=Integer.toString(num%3);
                    break;
                }else{
                    length += Integer.toString(num%3);
                    num/=3;
                }
            }
            for(int i = 0; i < length.length(); i++){
                answer += (Integer.parseInt(length.substring(i,i+1)) * (3 * Math.pow(3,length.length()-(i+2))));
            }
            System.out.println(answer);
            return answer;
        }
    }
    }
