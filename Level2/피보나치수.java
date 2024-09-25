package Level2;

//DP BOTTOM UP
public class 피보나치수 {
    class Solution {
        public int solution(int n) {
            int[] table = new int[100001];
            table[0] =0;
            table[1] = 1;
            for(int i = 2; i<table.length; i++){
                table[i] = (table[i-1] + table[i-2])% 1234567;
            }
            return table[n] ;
        }
    }
}
