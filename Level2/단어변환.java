package Level2;
import java.util.*;
public class 단어변환 {
    class Solution {
        public int solution(String begin, String target, String[] words) {
            Queue<Integer> q = new LinkedList();
            int answer = 0;
            int[] table = new int[words.length];
            for(int i = 0; i<words.length; i++){
                if(compareStr(begin, words[i])== begin.length()-1){
                    q.add(i);
                    table[i] = 1;
                }
            }
            while(!q.isEmpty()){
                int index = q.poll();
                for(int i = 0 ; i< words.length; i++){
                    if(table[i] == 0 && compareStr(words[index], words[i]) == begin.length()-1){
                        table[i] = table[index]+1;
                        q.add(i);
                    }
                }
            }


            for(int i = 0; i < words.length; i++){
                if(words[i].equals(target)){
                    return table[i];
                }
            }
            return answer;
        }

        private static int compareStr(String str1, String str2){
            int count = 0;
            for(int i = 0; i< str1.length(); i++){
                if(str1.charAt(i) == str2.charAt(i)){
                    count++;
                }
            }

            return count;
        }
    }
}
