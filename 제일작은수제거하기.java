public class 제일작은수제거하기 {
    class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {};
            int minValue = 2147483647;
            if(arr.length-1 == 0){
                answer = new int[1];
                answer[0]= -1;
                return answer;
            }
            answer = new int[arr.length-1];
            for(int i=0;i<arr.length;i++){
                if(minValue>arr[i]){
                    minValue=arr[i];
                }
            }
            int index = 0;
            for(int i=0;i<arr.length;i++){
                if(minValue==arr[i]){
                    continue;
                }
                answer[index++] = arr[i];
            }


            return answer;
        }
    }
}
