package Level2;

import java.util.*;
public class 모음사전{
class Solution {
    static ArrayList<String> strList = new ArrayList<>();
    static String[] words = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        for (String str : words) {
            depth(str);
        }
        return strList.indexOf(word) + 1;
    }
    public static void depth(String word) {
        if(word.length() <= 5){
            strList.add(word);
            for(String data : words){
                depth(word  + data);
            }
        }

    }
}

}