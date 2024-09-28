package Level2;

public class 점프와순간이동 {
    public class Solution {
        public int solution(int n) {
            int ans = 0;

            while(n!=0){
                if(n % 2 != 0){
                    n--;
                    ans++;
                }else{
                    n /= 2;
                }
            }

            return ans;
        }
    }
}
