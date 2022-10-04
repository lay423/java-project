package basic;

import java.util.Scanner;

public class CurrencyCnt2 {

    public static void main(String[] args) {
        int curr1 = 50000;
        int curr2 = 10000;
        int curr3 = 5000;
        int curr4 = 1000;
        int curr5 = 500;
        int curr6 = 100;
        int curr7 = 50;
        int curr8 = 10;

        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 넣으세요:");
        int money = sc.nextInt();
        System.out.print(curr1+"원"+money/curr1+"장");
        money = money % curr1;
        System.out.println(" 남은금액: "+money);
        System.out.print(curr2+"원"+money/curr2+"장");
        money = money % curr2;
        System.out.println(" 남은금액: "+money);
        System.out.print(curr3+"원"+money/curr3+"장");
        money = money % curr3;
        System.out.println(" 남은금액: "+money);
        System.out.print(curr4+"원"+money/curr4+"장");
        money = money % curr4;
        System.out.println(" 남은금액: "+money);
        System.out.print(curr5+"원"+money/curr5+"장");
        money = money % curr5;
        System.out.println(" 남은금액: "+money);
        System.out.print(curr6+"원"+money/curr6+"장");
        money = money % curr6;
        System.out.println(" 남은금액: "+money);
        System.out.print(curr7+"원"+money/curr7+"장");
        money = money % curr7;
        System.out.println(" 남은금액: "+money);
        System.out.print(curr8+"원"+money/curr8+"장");
    }


}
