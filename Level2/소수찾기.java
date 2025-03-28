package Level2;
import java.util.*;
public class 소수찾기 {
    class Solution {
        public int solution(String numbers) {
            int answer = 0;
            String[] seper = numbers.split("");
            ArrayList<String> list = new ArrayList();
            boolean[] table = new boolean[10000000];
            Arrays.fill(table,true);
            setPrimeTable(table);
            boolean[] visited = new boolean[numbers.length()];
            perm("", numbers, visited, list);
            Set<Integer> set = new HashSet<>();
            for (String data : list) {
                if (!data.isEmpty()) {
                    set.add(Integer.parseInt(data));
                }
            }
            for (int num : set) {
                if (table[num]) answer++;
            }



            return answer;
        }
        private static void perm(String current, String numbers, boolean[] visited, ArrayList<String> list) {
            if (!current.isEmpty()) {
                list.add(current);
            }
            for (int i = 0; i < numbers.length(); i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    perm(current + numbers.charAt(i), numbers, visited, list);
                    visited[i] = false;
                }
            }
        }
        private static void setPrimeTable(boolean[] table){
            table[0] = false;
            table[1] = false;
            for(int i = 0 ; i< Math.sqrt(table.length); i++){
                if(table[i]){
                    for(int j = 2; j< table.length; j++){
                        if(i*j>=10000000) break;
                        table[i*j] = false;
                    }
                }
            }

        }

    }
}
