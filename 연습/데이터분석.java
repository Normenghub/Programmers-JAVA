package 연습;
import java.util.*;
public class 데이터분석 {
    class Solution {
        public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
            HashMap<String,Integer> map = new HashMap();
            map.put("code",0);
            map.put("date",1);
            map.put("maximum",2);
            map.put("remain",3);
            ArrayList<int[]> list = new ArrayList();
            for(int[] temp : data){       if(temp[map.get(ext)] < val_ext) list.add(temp);    }
            list.sort(Comparator.comparingInt(a -> a[map.get(sort_by)]));
            int[][] answer = list.toArray(new int[list.size()][4]);



            return answer;
        }
    }
}
