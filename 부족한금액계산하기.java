public class 부족한금액계산하기 {
    class Solution {
        public long solution(int price, int money, int count) {
            long save = 0;
            for(int i = 1; i<=count; i++){
                save += (long) (price * i);
            }
            if(save - money >=0){
                return (long) save-money;
            }else{
                return 0;
            }
        }
    }
}
