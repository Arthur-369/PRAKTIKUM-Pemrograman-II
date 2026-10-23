package PRAK401_2510817310007_MuhammadRaflyAshShadiq;

import java.util.Scanner;

public class HewanPeliharaan {
    private String ras;
    private String nama;

    public HewanPeliharaan(String r, String n) {
        ras = r;
        nama = n;
    }

    public static String inputNama(Scanner input) {
        System.out.print("Nama Hewan Peliharaan: ");
        return input.nextLine();
    }

    public static String inputRas(Scanner input) {
        System.out.print("Ras: ");
        return input.nextLine();
    }

    public void display() {
        System.out.println();
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}