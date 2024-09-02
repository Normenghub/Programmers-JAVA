package 연습;

public class 옹알이two {
    class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            int index = 0;
            int sequance = -1;
            for(int i = 0; i< babbling.length; i++){
                boolean tf = false;
                while(index < babbling[i].length()){
                    if(babbling[i].charAt(index) == 'a'){
                        if(index + 2 >= babbling[i].length()){
                            break;
                        }
                        if(babbling[i].substring(index,index+3).equals("aya")){
                            if(sequance == 0){
                                break;
                            }
                            index += 3;
                            sequance = 0;
                        }else{
                            break;
                        }
                    }else if(babbling[i].charAt(index) == 'y'){
                        if(index + 1 >= babbling[i].length()){
                            break;
                        }
                        if(babbling[i].substring(index,index+2).equals("ye")){
                            if(sequance == 1){
                                break;
                            }
                            index += 2;
                            sequance = 1;
                        }else{
                            break;
                        }
                    }else if(babbling[i].charAt(index) == 'w'){
                        if(index + 2 >= babbling[i].length()){
                            break;
                        }
                        if(babbling[i].substring(index,index+3).equals("woo")){
                            if(sequance == 2){
                                break;
                            }
                            index += 3;
                            sequance = 2;
                        }else{
                            break;
                        }
                    }else if(babbling[i].charAt(index) == 'm'){
                        if(index + 1 >= babbling[i].length()){
                            break;
                        }
                        if(babbling[i].substring(index,index+2).equals("ma")){
                            if(sequance == 3){
                                break;
                            }
                            index += 2;
                            sequance = 3;
                        }else{
                            break;
                        }
                    }else{
                        break;
                    }

                    if(index == babbling[i].length()){
                        tf = true;
                    }
                }
                if(tf){
                    answer++;
                    tf = false;
                }
                index = 0;
                sequance = -1;
            }
            return answer;
        }
    }
}
