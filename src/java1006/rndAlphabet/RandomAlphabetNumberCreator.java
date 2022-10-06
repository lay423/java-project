package java1006.rndAlphabet;

public class RandomAlphabetNumberCreator implements NumberCreator{
    @Override
    public int create(int num) {
        if(num == 1)
            return (int)(Math.random()*26)+65;
        else
            return (int)(Math.random()*26)+97;
    }
}
