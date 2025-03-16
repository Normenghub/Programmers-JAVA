package Level3;
import java.util.*;
public class 베스트앨범 {
    class Solution {
        static HashMap<String, ArrayList<int[]>> map = new HashMap<>();
        public int[] solution(String[] genres, int[] plays) {

            HashMap<String, Integer> sumMap = new HashMap();
            ArrayList<Integer> answer = new ArrayList();
            for (int i = 0; i < genres.length; i++) {
                if(!map.containsKey(genres[i])){
                    map.put(genres[i], new ArrayList<>());
                    map.get(genres[i]).add(new int[]{plays[i], i});
                }else{
                    map.get(genres[i]).add(new int[]{plays[i], i});
                }
            }
            for(String genre : map.keySet()){
                sumMap.put(genre, returnSum(genre));
            }
            sortMapByFirstIndexDesc();
            Map<String,Integer> sortedDesc = sortByValue(sumMap,false);
            for(String genre : sortedDesc.keySet()){
                if(map.get(genre).size() == 1){
                    for(int[] arr : map.get(genre)){
                        answer.add(arr[1]);
                    }
                }else{
                    int count =0;
                    for(int[] arr : map.get(genre)){
                        if(count ==2) break;
                        answer.add(arr[1]);
                        count++;

                    }
                }
            }
            int[] result = new int[answer.size()];
            for(int i = 0 ; i < result.length; i++){
                result[i] = answer.get(i);
            }
            return result;

        }
        private static int returnSum(String genre){
            int sum = 0;
            for(int[] data : map.get(genre)){
                sum += data[0];
            }

            return sum;
        }
        private static Map<String, Integer> sortByValue(Map<String, Integer> map, boolean ascending) {
            // EntrySet을 리스트로 변환
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

            // 값(Value) 기준 정렬
            list.sort((o1, o2) -> ascending ? o1.getValue().compareTo(o2.getValue())
                    : o2.getValue().compareTo(o1.getValue()));

            // 정렬된 결과를 LinkedHashMap에 저장
            Map<String, Integer> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : list) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
            return sortedMap;
        }
        private static void sortMapByFirstIndexDesc() {
            for (ArrayList<int[]> list : map.values()) {
                list.sort((o1, o2) -> Integer.compare(o2[0], o1[0])); // 내림차순 정렬
            }
        }
    }
}
