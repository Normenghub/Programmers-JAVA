package 연습;

import java.util.*;
public class 숫자짝꿍 {
    public static void main(String[] args) {
        String answer = "";
        String X = "100";
        String Y = "2345";
        ArrayList<Integer> list = new ArrayList();
        HashMap<String, Integer> mapX = new HashMap<String, Integer>();
        HashMap<String, Integer> mapY = new HashMap<String, Integer>();
        for (int i = 0; i <= 9; i++) {
            mapX.put(Integer.toString(i), 0);
            mapY.put(Integer.toString(i), 0);
        }
        System.out.println(mapX);
        System.out.println(mapY);
        for (int i = 0; i < X.length(); i++) {
            String key = Character.toString(X.charAt(i));
            mapX.put(key, mapX.get(key) + 1);
        }
        for (int i = 0; i < Y.length(); i++) {
            String key = Character.toString(Y.charAt(i));
            mapY.put(key, mapY.get(key) + 1);
        }
        for (int q = 9; q >=0; q--) {
            String key = Integer.toString(q);
            if (mapX.get(key) == 0 || mapY.get(key) == 0) {
                continue;
            }
            if (mapX.get(key) > mapY.get(key)) {
                for (int i = 0; i < mapY.get(key); i++) {
                    list.add(Integer.parseInt(key));
                }
            } else if (mapX.get(key) == mapY.get(key)) {
                for (int i = 0; i < mapX.get(key); i++) {
                    list.add(Integer.parseInt(key));
                }
            } else {
                for (int i = 0; i < mapX.get(key); i++) {
                    list.add(Integer.parseInt(key));
                }
            }
        }
        if (list.size() == 0){
            answer +="-1";
        }else if(list.get(0) == 0){
            answer +="0";
        }
        else{
            for(Integer data : list){
                answer += Integer.toString(data);
            }
        }
        System.out.println(answer);
    }

}
