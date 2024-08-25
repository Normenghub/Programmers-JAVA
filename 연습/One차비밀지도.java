package 연습;

public class One차비밀지도 {
    class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String str1,str2,part;
            String[] answer = new String[n];
            for(int i = 0; i < n; i++){
                str1 = Integer.toBinaryString(arr1[i]);
                str2 = Integer.toBinaryString(arr2[i]);
                if(str1.length() <n){
                    String save = "";
                    for(int j = 0; j < n-str1.length(); j++){
                        save+="0";
                    }
                    str1 = save + str1;
                }
                if(str2.length() <n){
                    String save = "";
                    for(int j = 0; j < n-str2.length(); j++){
                        save+="0";
                    }
                    str2 = save + str2;
                }
                part = "";
                for(int j = 0; j < n; j++){
                    if(str1.charAt(j) == '1' || str2.charAt(j) == '1'){
                        part+="#";
                    }else{
                        part+=" ";
                    }
                }
                answer[i] = part;
            }
            return answer;
        }
    }
    }
