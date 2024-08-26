package 연습;
import java.util.ArrayList;
public class 빈배열에추가삭제하기 {
    class Solution {
        public int[] solution(int[] arr, boolean[] flag) {
            int[] answer = {};
            int index = 0;
            ArrayList<Integer> list = new ArrayList();
            for(int i = 0; i< arr.length; i++){
                if (flag[i] == true){
                    for(int k = 0; k < arr[i] * 2; k++){
                        list.add(arr[i]);
                    }
                }else{
                    for(int k =0; k<arr[i]; k++){
                        list.remove(list.size()-1);
                    }
                }
            }
            answer = new int[list.size()];
            for(int i = 0; i< list.size(); i++){
                answer[index++]= list.get(i);
            }
            return answer;
        }
    }
}
