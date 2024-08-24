package 연습;

public class 최소직사각형 {
    class Solution {
        public int solution(int[][] sizes) {
            int answer,width,height;
            width = 0;
            height = 0;
            for(int i = 0; i< sizes.length; i++){
                int big,small;
                if(sizes[i][0] < sizes[i][1]){
                    big = sizes[i][1];
                    small = sizes[i][0];
                }else{
                    small = sizes[i][1];
                    big = sizes[i][0];
                }
                if(width < big){
                    width = big;}
                if(height < small){
                    height = small;
                }
            }
            answer = width * height;
            return answer;
        }
    }
}
