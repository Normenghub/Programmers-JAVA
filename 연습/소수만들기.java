package 연습;

import java.util.ArrayList;


public class 소수만들기 {
    public static void main(String[] args) {
            int[] nums = {1,2,3};
            int answer = 0 ;
        ArrayList<Integer> list = new ArrayList<>();
           for(int i=0;i<nums.length;i++){
               for(int j=i;j<nums.length;j++){
                   if(i==j){
                       continue;
                   }
                   for(int k=j;k<nums.length;k++){
                       if(j!=k && i !=k){
                           list.add(nums[i]+nums[j]+nums[k]);
                       }
                   }
               }
           }
        for(Integer data: list){

            int count = 0;
            for(int i = 1; i <=data ; i++){
                if(data % i == 0){
                    count ++;
                }
                if(count >2){
                    break;
                }
            }
            if(count==2){
                answer+=1;
            }

        }
        System.out.println(answer);

    }
}
