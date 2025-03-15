package Level3;
import java.util.*;
public class 단속카메라 {
    class Solution {
        public int solution(int[][] routes) {
            int answer = 0;
            Arrays.sort(routes, (a,b) -> Integer.compare(a[0],b[0]));
            int start = 0;
            int end = 0;
            for(int[] arr : routes){

                if(start == 0 && end == 0){
                    answer++;
                    start = arr[0];
                    end = arr[1];
                }else{
                    if(start <= arr[0] && end >= arr[0]){
                        start = arr[0];
                        if(end > arr[1]){
                            end = arr[1];
                        }
                    }else{
                        answer++;
                        start = arr[0];
                        end = arr[1];
                    }
                }

            }
            return answer;
        }
    }
}
