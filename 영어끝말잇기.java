import java.util.*;
public class 영어끝말잇기 {
    public static void main(String[] args) {
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int n = 3;

        String presentWord = "";
        HashMap<String,Boolean> map = new HashMap<>();
        int order = 1;
        int cycle = 1;
        for(String word : words){
            if (map.size() == 0){
                order ++;
                presentWord = word;
                map.put(word,true);
                continue;
            }
            if(presentWord.charAt(presentWord.length()-1) ==
                    word.charAt(0) && !map.containsKey(word)){
                map.put(word,true);
                order++;
                presentWord = word;
                if(order> n){
                    order = 1;
                    cycle++;
                }

            }else{
                int[] answer = {order,cycle};
                System.out.println(answer);
            }


        }
        int[] answer = {0,0};
        System.out.println(answer);
    }
}
