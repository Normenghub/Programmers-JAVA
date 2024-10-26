package Level2;

public class 타겟넘버 {
    class Solution {
        static int answer = 0;
        public int solution(int[] numbers, int target) {
            dfs(0,0,numbers,target);
            return answer;
        }

        private void dfs(int count,int index,int[] numbers, int target){
            if(index == numbers.length){
                if(count == target) answer++;
            }else{
                dfs(count+numbers[index],index+1,numbers,target);
                dfs(count-numbers[index],index+1,numbers,target);
            }
        }

    }
}
