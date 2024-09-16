package 연습;

public class 바탕화면정리 {
    class Solution {
        public int[] solution(String[] wallpaper) {
            int[] answer = {99,99,-1,-1};

            for(int i = 0; i<wallpaper.length; i++){
                for(int k = 0; k<wallpaper[i].length(); k++){
                    if(wallpaper[i].charAt(k) == '#'){
                        if(answer[0] > i) answer[0] = i;
                        if(answer[1] > k) answer[1] = k;
                        if(answer[2] < i+1) answer[2] = i+1;
                        if(answer[3] < k+1) answer[3] = k+1;
                    }
                }
            }

            return answer;
        }
    }
}
