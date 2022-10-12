package java1012;

import java.util.Scanner;

public class MaxNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0, iIdx = 0, jIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    iIdx = i;
                    jIdx = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((iIdx+1) + " " + (jIdx+1));
    }
}
