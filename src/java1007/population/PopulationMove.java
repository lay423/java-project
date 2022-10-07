package java1007.population;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    //constructor 추가 fromSido, toSIdo를 받아서 멤버변수에 넣는 기능

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }
}
