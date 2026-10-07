package PRAK202_2510817310007_MuhammadRaflyAshShadiq;

public class Kopi {
    private String pembeli;
    String namaKopi, ukuran;
    double harga;

    public double hitungPajak() {
        return harga * 11 / 100;
    }

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return pembeli + "\nPajak Kopi: Rp. " + hitungPajak();
    }
}


