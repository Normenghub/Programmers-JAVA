package Level2;
import java.util.*;
public class 파일명정렬 {
    class Solution {
        static String[][] save;
        public String[] solution(String[] files) {
            String[] answer = new String[files.length];
            save = new String[files.length][3];
            subArr(files);
            sortArray(0);
            sortArray(1);




            for(int i = 0; i<save.length; i++){
                answer[i] = save[i][0] + save[i][1] + save[i][2];
            }

            return answer;
        }

        private static void sortArray(int column){
            Arrays.sort(save, Comparator
                    .comparing((String[] row) -> row[0].toLowerCase())
                    .thenComparing(row -> Integer.parseInt(row[1]))
            );

        }
        private static void subArr(String[] files){
            int index= 0;
            for(int i=0; i< save.length; i++){
                Arrays.fill(save[i],"");
            }
            for(String data : files){
                int count = 0;
                while(count < data.length() && !Character.isDigit(data.charAt(count))){
                    count++;
                }

                save[index][0] = data.substring(0, count);
                int numCount = count;

                while(count < data.length() && Character.isDigit(data.charAt(count))){
                    count++;
                }
                save[index][1] += data.substring(numCount, count);
                save[index][2] += data.substring(count, data.length());
                if(save[index][1].length() > 5){
                    String cache = save[index][1].substring(5,save[index][1].length());
                    save[index][1] = save[index][1].substring(0,5);
                    String d = cache + save[index][2];
                    save[index][2] = d;

                }
                index++;
            }
        }
        private static String normalize(String str) {
            return str.replaceFirst("^0+", "");
        }
    }
}
