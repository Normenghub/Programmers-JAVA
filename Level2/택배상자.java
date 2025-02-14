package Level2;
import java.util.*;
public class 택배상자 {
    class Solution {
        public int solution(int[] order) {

            Stack<Integer> result = new Stack();
            Stack<Integer> help = new Stack();
            int index = 0;
            int number = 1;
            while(result.size() == 0){
                if(order[index] == number){
                    result.push(number);
                    number++;
                    index++;
                }else{
                    help.push(number);
                    number++;
                }
            }
            if(number > order.length){
                while(true){
                    if(help.size() == 0) break;
                    if(help.peek() == order[index]){
                        result.push(help.pop());
                        index++;
                    }else break;
                }
            }else{
                while(true){
                    if(index >= order.length) break;
                    if(order[index] < result.peek()){
                        if(help.peek() == order[index]){
                            result.push(help.pop());
                            index++;
                        }else break;
                    }else{
                        while(number != order[index]){
                            help.push(number);
                            number++;
                        }
                        result.push(number++);
                        index++;

                    }
                }
            }
            return result.size();
        }
    }


//1 4 3 5
// 2 3
}
