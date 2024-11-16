package Level2;
import java.util.*;
public class 방문길이 {
    class Solution {
        static HashMap<String,Boolean> map = new HashMap();
        static int answer = 0;
        public int solution(String dirs) {
            int[] coordinate = {0,0};
            for(int i = 0; i < dirs.length(); i++){
                coordinate = direction(Character.toString(dirs.charAt(i)), coordinate);
            }
            return answer;
        }
        private int[] direction(String direct,int[] coordinate){
            int y = coordinate[0];
            int x = coordinate[1];
            if(direct.equals("U")){
                coordinate[0] -=1;
                if(checkHash(coordinate,y,x)){
                    return coordinate;
                }else{
                    coordinate[0] = y;
                    coordinate[1] = x;
                    return coordinate;
                }
            }else if(direct.equals("D")){
                coordinate[0] +=1;
                if(checkHash(coordinate,y,x)){
                    return coordinate;
                }else{
                    coordinate[0] = y;
                    coordinate[1] = x;
                    return coordinate;
                }
            }else if(direct.equals("R")){
                coordinate[1] +=1;
                if(checkHash(coordinate,y,x)){
                    return coordinate;
                }else{
                    coordinate[0] = y;
                    coordinate[1] = x;
                    return coordinate;
                }
            }else{
                coordinate[1] -=1;
                if(checkHash(coordinate,y,x)){
                    return coordinate;
                }else{
                    coordinate[0] = y;
                    coordinate[1] = x;
                    return coordinate;
                }
            }
        }
        private Boolean checkOut(int[] coordinate){
            return (-5 <= coordinate[0] && coordinate[0] <=5) && (-5 <= coordinate[1] && coordinate[1] <=5);
        }
        private Boolean checkHash(int[] coordinate,int y,int x){
            String coor = Integer.toString(y) + Integer.toString(coordinate[0]) + Integer.toString(x) + Integer.toString(coordinate[1]);
            String coor2 = Integer.toString(coordinate[0]) + Integer.toString(y) + Integer.toString(x) + Integer.toString(coordinate[1]);
            String coor3 = Integer.toString(coordinate[0]) + Integer.toString(y) + Integer.toString(coordinate[1]) + Integer.toString(x);
            if(checkOut(coordinate)){
                if(map.containsKey(coor3) && map.containsKey(coor2) && map.containsKey(coor3)){
                }else{
                    if(!map.containsKey(coor)){
                        map.put(coor,true);
                    }
                    if(!map.containsKey(coor2)){
                        map.put(coor2,true);
                    }
                    if(!map.containsKey(coor3)){
                        map.put(coor3,true);
                    }
                    answer++;
                }

                return true;

            }else{
                return false;
            }
        }

    }
}
