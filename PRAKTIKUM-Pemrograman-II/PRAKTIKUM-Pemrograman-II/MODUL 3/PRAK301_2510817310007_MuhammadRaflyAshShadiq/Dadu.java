package PRAK301_2510817310007_MuhammadRaflyAshShadiq;

public class Dadu {
    private int nilai;
    public Dadu() {
        acakNilai();
    }

    public void acakNilai() {
        nilai = (int) (Math.random() * 6) + 1;
    }

    public int getNilai() {
        return nilai;
    }
}