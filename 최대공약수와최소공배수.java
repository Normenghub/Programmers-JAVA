public class 최대공약수와최소공배수 {
    // 유클리드 호제법
    class Solution {
        public int[] solution(int n, int m) {
            int gcd = getGcd(n,m);
            int[] answer = {gcd,(n*m)/gcd};
            return answer;
        }
        static int getGcd(int n, int m){
            if(n%m ==0){
                return m;
            }
            return getGcd(m,n%m);
        }
    }
}
