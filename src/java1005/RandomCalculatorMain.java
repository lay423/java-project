package java1005;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        NumberCreator numberCreator = new RandomNumberCreator();
        RandomCalculator rCal = new RandomCalculator(2, numberCreator);
        rCal.plus();
        rCal.minus();
        rCal.multiple();
        rCal.divide();
    /*
        실행결과 case1
        2 + 8 = 10
        2 - 8 = -6
        2 * 8 = 16
        2 / 8 = 0.250000

        실행결과 case1
        2 + 0 = 2
        2 - 0 = 2
        2 * 0 = 0
        2 / 0 오류발생
     */
    }
}
