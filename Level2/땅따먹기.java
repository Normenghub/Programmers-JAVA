package Level2;

import java.util.*;

public class 땅따먹기 {
    public static void main(String[] args) {
        class Solution {
            int solution(int[][] land) {

                for (int i = 0; i < land.length - 1; i++) {
                    int firstMax = -1;
                    int secondMax = -1;
                    int fIndex = -1;
                    int sIndex = -1;
                    for (int k = 0; k < land[i].length; k++) {
                        if (land[i][k] > firstMax) {
                            secondMax = firstMax;
                            firstMax = land[i][k];
                            sIndex = fIndex;
                            fIndex = k;
                        } else if (land[i][k] > secondMax) {
                            secondMax = land[i][k];
                            sIndex = k;
                        }
                    }
                    land[i + 1][fIndex] = land[i + 1][fIndex] + land[i][sIndex];
                    for (int j = 0; j < land[i].length; j++) {
                        if (j != fIndex) {
                            land[i + 1][j] = land[i + 1][j] + land[i][fIndex];
                        }
                    }


                }
                int m = 0;
                for (int data : land[land.length - 1]) {
                    if (m < data) m = data;
                }
                System.out.println(m);

                return m;
            }
        }
    }}
