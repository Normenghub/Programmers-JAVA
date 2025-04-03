package Level2;

public class 두개이하로다른비트 {
    class Solution {
        public long[] solution(long[] numbers) {
            long[] answer = new long[numbers.length];
            int index= 0;
            for(long data :numbers){
                if(data % 2 ==0){
                    answer[index++] = data +1;
                }else{
                    String binaryData = Long.toBinaryString(data);
                    if(binaryData.contains("0")){
                        int idx = binaryData.lastIndexOf("0");
                        binaryData = binaryData.substring(0,idx) + "10" + binaryData.substring(idx+2);
                    }else{
                        binaryData = "10" + binaryData.substring(1);
                    }
                    answer[index++] = Long.parseLong(binaryData,2);
                }
            }
            return answer;
        }
    }
}
