package 연습;

public class 신규아이디추천 {
    class Solution {
        public String solution(String new_id) {
            String answer = allStep(new_id);
            return answer;
        }
        static String step1(String id){
            String str = "";
            for(int i =0; i<id.length(); i++){
                int toInt = (int) id.charAt(i);
                if(toInt>=65 && toInt <= 90){
                    str += Character.toString((char) (toInt + 32));
                }else{
                    str += id.substring(i,i+1);
                }
            }
            return str;
        }
        static String step2(String id){
            String str = "";
            for(int i =0; i<id.length(); i++){
                int toInt = (int) id.charAt(i);
                if((toInt>=97 && toInt <= 122) || (toInt>=48 && toInt <= 57) || toInt == 45 || toInt == 95 || toInt == 46){
                    str += Character.toString((char) toInt);
                }
            }
            return str;
        }
        static String step3(String id){
            String str = id;
            while(str.contains("..")){
                str= str.replace("..", ".");
            }
            return str;
        }
        static String step4(String id){
            String str = id;
            while(true){
                if(str.charAt(0) == '.'){
                    str = str.substring(1,str.length());
                }
                if(str.length() ==0){
                    break;
                }
                if(str.charAt(str.length()-1) == '.'){
                    str = str.substring(0,str.length()-1);
                }
                if(str.length() ==0){
                    break;
                }
                if(str.charAt(0) != '.' && str.charAt(str.length()-1) != '.'){
                    break;
                }
            }
            return str;
        }
        static String step5(String id){
            String str = id;
            if(str.length() == 0){
                str = "a";
            }
            return str;
        }
        static String step6(String id){
            String str = id;
            int index = 14;
            if(str.length()>=16){
                str = str.substring(0,15);
                while(str.charAt(index) == '.'){
                    str = str.substring(0,index);
                    index--;
                }
            }
            return str;
        }
        static String step7(String id){
            String str = id;
            char saveStr = str.charAt(str.length()-1);
            if(str.length()<=2){
                while(str.length() != 3){
                    str += saveStr;
                }
            }
            return str;
        }
        static String allStep(String id){
            String result = step1(id);
            result = step2(result);
            result = step3(result);
            result = step4(result);
            result = step5(result);
            result = step6(result);
            result = step7(result);
            return result;
        }
    }
}
