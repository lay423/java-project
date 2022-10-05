package java1005;

public class RandomNumberCreator implements NumberCreator{

    @Override
    public int create() {
        return (int)(Math.random()*10);
    }
}
