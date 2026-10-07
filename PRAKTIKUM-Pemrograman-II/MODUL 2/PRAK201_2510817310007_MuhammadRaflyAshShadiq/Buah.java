package PRAK201_2510817310007_MuhammadRaflyAshShadiq;

import java.util.Locale;

public class Buah {
    private String nama;
    private double berat, harga, jumlahBeli;

    public Buah(String nama, double berat, double harga, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public double hitungHargaSebelumDiskon() {
        return (jumlahBeli / berat) * harga;
    }

    public double hitungTotalDiskon() {
        int jumlahBlok = (int) (jumlahBeli / 4);
        double hargaPerBlok = (4 / berat) * harga;
        return hargaPerBlok * 0.02 * jumlahBlok;
    }

    public double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungTotalDiskon();
    }

    public void tampilkanData() {
        Locale.setDefault(Locale.US);
        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "Kg");
        System.out.printf("Harga Sebelum Diskon: %.2f\n", hitungHargaSebelumDiskon());
        System.out.printf("Total Diskon: %.2f\n", hitungTotalDiskon());
        System.out.printf("Harga Setelah Diskon: %.2f\n\n", hitungHargaSetelahDiskon());

    }
}