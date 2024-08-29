package 연습;

public class 카드뭉치 {
    class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {

            int index = 0;
            String present = cards1[index];
            int count = 0;
            for(int i =0; i < goal.length; i++){
                if(present.equals(goal[i])){
                    count++;
                    index++;
                    if(index == cards1.length){
                        break;
                    }
                    present = cards1[index];
                }
            }
            index = 0;
            present = cards2[index];

            for(int i =0; i < goal.length; i++){
                if(present.equals(goal[i])){
                    count++;
                    index++;
                    if(index == cards2.length){
                        break;
                    }
                    present = cards2[index];
                }

            }
            System.out.println(count);
            if(count == goal.length){
                return "Yes";
            }else{
                return "No";
            }

        }
    }
}
