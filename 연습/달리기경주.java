package 연습;
import java.util.*;

public class 달리기경주 {
    class Solution {
        public String[] solution(String[] players, String[] callings) {
            HashMap<String,Integer> map = new HashMap();
            for(int i = 0; i<players.length; i++){
                map.put(players[i],i);
            }
            for(String data : callings){
                int playerOne = map.get(data);
                String tmp = players[playerOne-1];
                players[playerOne-1] = data;
                players[playerOne] = tmp;
                map.put(data,playerOne-1);
                map.put(tmp,playerOne);
            }

            return players;
        }
    }
}
