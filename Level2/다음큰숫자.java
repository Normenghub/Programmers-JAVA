package Level2;

public class 다음큰숫자 {
    class Solution {
        public int solution(int n) {
            int countOne= 0;
            String nToBinary = Integer.toString(n,2);
            for(int i = 0; i<nToBinary.length(); i++){
                if(nToBinary.charAt(i) == '1') countOne++;
            }
            while(true){
                int countTwo = 0;
                String nPlusToBinary = Integer.toString(++n,2);
                for(int i = 0; i<nPlusToBinary.length(); i++){
                    if(nPlusToBinary.charAt(i) == '1') countTwo++;
                }

                if(countTwo == countOne) break;
            }
            return n;
        }
    }
}
