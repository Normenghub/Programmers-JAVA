package Level2;

public class 예상대진표 {
    class Solution
    {
        public int solution(int n, int a, int b)
        {
            int answer = 0;

            while(true){
                if(a == b) break;
                if(a != 1){
                    if(a % 2 == 0) a /=2;
                    else a = a/2 + 1;
                }
                if(b != 1){
                    if(b % 2 == 0) b/=2;
                    else b = b/2 + 1;
                }
                answer++;
            }


            return answer;
        }
    }
}
