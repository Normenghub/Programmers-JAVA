package 연습;

import java.util.Scanner;

public class 직사각형별찍기 {
    class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int i = 0; i <b; i++){
                for(int k = 0; k<a; k++){
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }

}
