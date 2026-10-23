package PRAK401_2510817310007_MuhammadRaflyAshShadiq;

import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = HewanPeliharaan.inputNama(input);
        String ras = HewanPeliharaan.inputRas(input);

        HewanPeliharaan hewan = new HewanPeliharaan(ras, nama);
        hewan.display();

        input.close();
    }
}