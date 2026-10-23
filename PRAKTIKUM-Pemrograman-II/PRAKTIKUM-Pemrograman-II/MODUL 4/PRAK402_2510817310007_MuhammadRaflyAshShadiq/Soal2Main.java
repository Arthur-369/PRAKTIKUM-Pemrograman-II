package PRAK402_2510817310007_MuhammadRaflyAshShadiq;

import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1 || pilihan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = input.nextLine();

            System.out.print("Ras: ");
            String ras = input.nextLine();

            System.out.print("Warna Bulu: ");
            String warnaBulu = input.nextLine();


            if (pilihan == 1) {
                Kucing kucing = new Kucing(ras, nama, warnaBulu);
                kucing.displayDetailKucing();
            } else {
                System.out.print("Kemampuan : ");
                String dataKemampuan = input.nextLine();
                String[] kemampuan = dataKemampuan.split(",\\s*");

                Anjing anjing = new Anjing(
                        nama, ras, warnaBulu, kemampuan
                );
                anjing.displayDetailAnjing();
            }
        }

        input.close();
    }
}