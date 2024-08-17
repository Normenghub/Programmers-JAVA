/*
*    Marathon on BaekJoon
*
* */


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int b = 0;
        int savea,saveb;
        for(int i = 1; i <=n; i++) {
                savea = a;
                saveb = b;
                b +=savea;
                a = a-savea + saveb;




        }

        System.out.print(a);
        System.out.println(" " + b);
    }
}