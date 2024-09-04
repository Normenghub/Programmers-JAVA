import java.util.*;
public class 일차다트게임 {
    class Solution {
        public int solution(String dartResult) {
            int answer = 0;
            int[] arr = new int[3];
            int index = 0;
            int count = 0;
            String save = "";
            while (index != dartResult.length()) {
                if (((int) dartResult.charAt(index)) >= 48 && ((int) dartResult.charAt(index)) <= 57) {
                    save += dartResult.substring(index, index + 1);
                    index++;
                } else {
                    if (save.length() == 0) {
                        index++;
                    } else {
                        arr[count++] = Integer.parseInt(save);
                        save = "";
                    }
                }
            }
            index = 0;
            for (int i = 0; i < dartResult.length(); i++) {
                if (dartResult.charAt(i) == 'D') {
                    arr[index] = arr[index] * arr[index];
                    index++;
                } else if (dartResult.charAt(i) == 'T') {
                    arr[index] = arr[index] * arr[index] * arr[index];
                    index++;
                } else if (dartResult.charAt(i) == 'S') index++;

                if (dartResult.charAt(i) == '#') {
                    if (index >= 1) {
                        arr[index - 1] = arr[index - 1] * -1;
                    }
                } else if (dartResult.charAt(i) == '*') {
                    if (index == 1) {
                        arr[index - 1] = arr[index - 1] * 2;
                    } else if (index >= 2) {
                        arr[index - 1] = arr[index - 1] * 2;
                        arr[index - 2] = arr[index - 2] * 2;
                    }
                }


            }
            for (int data : arr) {
                answer += data;
            }

            return answer;
        }
    }
}
