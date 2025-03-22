package Level3;

import java.util.*;
public class 이중우선순위큐 {
        class Solution {
                static boolean[] trueFalse;
                public int[] solution(String[] operations) {
                        ArrayList<Integer> list = new ArrayList();
                        int[] answer = {0,0};
                        PriorityQueue<int[]> maxqueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
                        PriorityQueue<int[]> minqueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
                        trueFalse = new boolean[operations.length];
                        for(int i = 0; i<operations.length; i++){
                                String[] operator = operations[i].split(" ");
                                if(operator[0].equals("I")){
                                        maxqueue.add(new int[]{-Integer.parseInt(operator[1]),i});
                                        minqueue.add(new int[]{Integer.parseInt(operator[1]),i});
                                        trueFalse[i] = true;

                                }else{
                                        sync(maxqueue);
                                        if(maxqueue.isEmpty()) continue;
                                        if(operator[1].equals("1")){
                                                int[] maxNum = maxqueue.poll();
                                                trueFalse[maxNum[1]] = false;
                                                sync(minqueue);
                                        }else{
                                                sync(maxqueue);
                                                if(minqueue.isEmpty()) continue;
                                                int[] minNum = minqueue.poll();
                                                trueFalse[minNum[1]] = false;
                                        }
                                }

                        }
                        sync(maxqueue);
                        sync(minqueue);
                        if(minqueue.isEmpty()){
                                return answer;
                        }
                        return new int[]{-maxqueue.peek()[0],minqueue.peek()[0]};
                }
                private static void sync(PriorityQueue<int[]> q){
                        while(!q.isEmpty() && !trueFalse[q.peek()[1]]){
                                q.poll();
                        }
                }

        }

}
