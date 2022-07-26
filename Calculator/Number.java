package Calculator;

public class Number {

    private int cyfra;
    private String arabOrRom;

    Number(int cyfra, String arabOrRom) {
        this.cyfra = cyfra;
        this.arabOrRom = arabOrRom;
    }

    int getValue() {
        return cyfra;
    }

    String getType() {
        return arabOrRom;
    }
}
