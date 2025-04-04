package 연습;
import java.util.*;
public class 지폐접기 {
    class Solution {
        public int solution(int[] wallet, int[] bill) {
            int answer = 0;
            while(true){
                if(wallet[0] >= bill[0] && wallet[1] >= bill[1]) break;
                if(bill[0] >= bill[1]){
                    bill[0] = bill[0]/2;
                }else{
                    bill[1] = bill[1]/2;
                }
                Arrays.sort(wallet);
                Arrays.sort(bill);
                answer++;
            }
            return answer;
        }
    }
}
