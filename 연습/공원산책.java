package 연습;

public class 공원산책 {
    class Solution {
        public int[] solution(String[] park, String[] routes) {
            int[] answer = {0,0};
            boolean flag = false;
            for(int i = 0; i < park.length; i++){
                for(int j = 0; j < park[i].length(); j++){
                    if(park[i].charAt(j) == 'S'){
                        answer[0] = i;
                        answer[1] = j;
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            for(String data : routes){
                String[] save = data.split(" ");
                if(save[0].equals("N")){
                    if(checkN(answer[0],answer[1],Integer.parseInt(save[1]),park)){
                        answer[0] -= Integer.parseInt(save[1]);
                    }
                }else if(save[0].equals("S")){
                    if(checkS(answer[0],answer[1],Integer.parseInt(save[1]),park)){
                        answer[0] += Integer.parseInt(save[1]);
                    }
                }else if(save[0].equals("W")){
                    if(checkW(answer[0],answer[1],Integer.parseInt(save[1]),park)){
                        answer[1] -= Integer.parseInt(save[1]);
                    }
                }else{
                    if(checkE(answer[0],answer[1],Integer.parseInt(save[1]),park)){
                        answer[1] += Integer.parseInt(save[1]);
                    }
                }
            }
            return answer;
        }
        static boolean checkN(int y,int x, int distance, String[] park){
            boolean check = true;
            int index = 0;
            while(index != distance){
                y--;
                if(y == -1){
                    return false;
                }
                if(park[y].charAt(x) == 'X'){
                    return false;
                }
                index++;
            }
            return check;
        }
        static boolean checkS(int y,int x, int distance, String[] park){
            boolean check = true;
            int index = 0;
            while(index != distance){
                y++;
                if(y == park.length){
                    return false;
                }
                if(park[y].charAt(x) == 'X'){
                    return false;
                }
                index++;
            }
            return check;
        }
        static boolean checkW(int y,int x, int distance, String[] park){
            boolean check = true;
            int index = 0;
            while(index != distance){
                x--;
                if(x == -1){
                    return false;
                }
                if(park[y].charAt(x) == 'X'){
                    return false;
                }

                index++;
            }
            return check;
        }
        static boolean checkE(int y,int x, int distance, String[] park){
            boolean check = true;
            int index = 0;
            while(index != distance){
                x++;
                if(x == park[y].length()){
                    return false;
                }
                if(park[y].charAt(x) == 'X'){
                    return false;
                }
                index++;
            }
            return check;
        }
    }
}
