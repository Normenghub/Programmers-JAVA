package 연습;
import java.util.*;

public class 가장많이받은선물 {
    class Solution {
        static int answer = 0;
        static HashMap<String,HashMap<String,Integer>> table = new HashMap();
        static HashMap<String,int[]> indexTable = new HashMap();
        public int solution(String[] friends, String[] gifts) {
            setTable(friends);
            giveGift(gifts);
            getGiftIndex();
            return answer;
        }
        static void setTable(String[] friends){
            for(int i = 0 ; i < friends.length; i++){
                table.put(friends[i],new HashMap());
                indexTable.put(friends[i],new int[2]);
            }
            for(int i =0; i < friends.length; i++){
                for(int j = 0; j<friends.length; j++){
                    if(i == j) continue;
                    table.get(friends[i]).put(friends[j],0);
                }
            }
        }
        static void giveGift(String[] gifts){
            for(String data : gifts){
                String[] to = data.split(" ");
                table.get(to[0]).put(to[1],table.get(to[0]).get(to[1])+1);
                indexTable.get(to[0])[0]++;
                indexTable.get(to[1])[1]++;

            }
        }
        static void getGiftIndex(){
            for(String given : table.keySet()){
                int count = 0;
                for(String getGift : table.get(given).keySet()){
                    if(table.get(given).get(getGift) > table.get(getGift).get(given)){
                        count++;
                    }else if ((table.get(given).get(getGift) == 0 && table.get(getGift).get(given) == 0) ||
                            table.get(given).get(getGift) == table.get(getGift).get(given)){
                        if((indexTable.get(given)[1] - indexTable.get(given)[0]) < (indexTable.get(getGift)[1] - indexTable.get(getGift)[0])) {
                            count++;
                        }
                    }
                }
                if(answer < count) answer = count;
            }


        }

    }
}
