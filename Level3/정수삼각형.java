package Level3;

// DP BOTTOM UP way

public class 정수삼각형 {
    class Solution {
        public int solution(int[][] triangle) {
            for(int i = triangle.length-1; i>0; i--){
                int index = 0;
                int nextIndex = i-1;
                for(int j = 0; j<triangle[i].length-1; j++){
                    if(triangle[i][j] + triangle[nextIndex][index] > triangle[i][j+1] + triangle[nextIndex][index]){
                        triangle[nextIndex][index] = triangle[i][j] + triangle[nextIndex][index];
                    }else{
                        triangle[nextIndex][index] = triangle[i][j+1] + triangle[nextIndex][index];
                    }
                    index++;
                }
            }

            return triangle[0][0];
        }
    }
}
