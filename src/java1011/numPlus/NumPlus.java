package java1011.numPlus;

import java.util.Scanner;

public class NumPlus {
    int solution(int n){
        int place = 100000000;
        int[] plusNum = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int result = 0;
        int j=0;
        for (int i = place; i >= 1; i /= 10) {
            if (n / i != 0) {
                plusNum[j] = n / i;
                n %= i;
                j++;
            }
        }
        for (int i : plusNum) {
            result += i;
        }

        return result;
    }
    public static void main(String[] args) {
        NumPlus numPlus = new NumPlus();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numPlus.solution(n));
    }
}
