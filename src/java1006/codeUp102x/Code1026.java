package java1006.codeUp102x;

import java.util.Scanner;

public class Code1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(":");
        if (arr[1].equals("00")) {
            System.out.println("0");
        } else{
            System.out.println(arr[1]);
        }

    }
}
