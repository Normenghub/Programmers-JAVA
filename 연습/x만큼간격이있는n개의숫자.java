package 연습;

class x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 1; i<=n; i++){
            answer[i-1] = (long) x * i;
        }
        return answer;
    }
}