package java1006.setNum;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
//        RndNumbersWithoutDuplicated rnwd = new RndNumbersWithoutDuplicated(50);
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
        for(int i=0; i<50; i++){
            int r = randomNumberCreator.create(10);
            System.out.println(r);
        }
    }
}
