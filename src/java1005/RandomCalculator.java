package java1005;

import java.util.IllegalFormatConversionException;

public class RandomCalculator implements Calculator{

    private int random;


    public RandomCalculator(){
        random = (int)(Math.random()*10);
    }
    public void plus(int a){
        System.out.printf("%d + %d = %d",
                a,
                random,
                a+random);
        System.out.println();
    }
    public void minus(int a){
        System.out.printf("%d - %d = %d",
                a,
                random,
                a-random);
        System.out.println();
    }
    public void multiple(int a){
        System.out.printf("%d * %d = %d",
                a,
                random,
                a*random);
        System.out.println();
    }
    public void divide(int a){
        try{
            float result = a/random;
            System.out.printf("%d / %d = %f",
                    a,
                    random,
                    (float)a/random);
        }catch (ArithmeticException e){
            System.out.printf("%d / %d 오류발생",
                    a,
                    random);
        }


        System.out.println();
    }
}
