package PRAK302_2510817310007_MuhammadRaflyAshShadiq;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> daftarBulan = new HashMap<>();
        daftarBulan.put(1, "Januari");
        daftarBulan.put(2, "Februari");
        daftarBulan.put(3, "Maret");
        daftarBulan.put(4, "April");
        daftarBulan.put(5, "Mei");
        daftarBulan.put(6, "Juni");
        daftarBulan.put(7, "Juli");
        daftarBulan.put(8, "Agustus");
        daftarBulan.put(9, "September");
        daftarBulan.put(10, "Oktober");
        daftarBulan.put(11, "November");
        daftarBulan.put(12, "Desember");

        LinkedList<Negara> daftarNegara = new LinkedList<>();

        int jumlahNegara = Integer.parseInt(input.nextLine());

        for (int i = 0; i < jumlahNegara; i++) {
            System.out.println("Data negara ke-" + (i + 1));

            System.out.print("Nama negara: ");
            String nama = input.nextLine();

            if (nama.trim().isEmpty()) {
                continue;
            }

            System.out.print("Jenis kepemimpinan: ");
            String jenisKepemimpinan = input.nextLine();

            if (jenisKepemimpinan.trim().isEmpty()) {
                daftarNegara.add(new Negara(nama, "", "", 0, 0, 0));
                continue;
            }

            System.out.print("Nama pemimpin: ");
            String namaPemimpin = input.nextLine();

            if (namaPemimpin.trim().isEmpty()) {
                daftarNegara.add(new Negara(
                        nama, jenisKepemimpinan, "", 0, 0, 0
                ));
                continue;
            }

            int tanggal = 0;
            int bulan = 0;
            int tahun = 0;

            System.out.print("Tanggal kemerdekaan: ");
            String inputTanggal = input.nextLine();

            if (inputTanggal.trim().isEmpty()) {
                daftarNegara.add(new Negara(
                        nama, jenisKepemimpinan, namaPemimpin, 0, 0, 0
                ));
                continue;
            }

            tanggal = Integer.parseInt(inputTanggal);

            System.out.print("Bulan kemerdekaan: ");
            String inputBulan = input.nextLine();

            if (inputBulan.trim().isEmpty()) {
                daftarNegara.add(new Negara(
                        nama, jenisKepemimpinan, namaPemimpin,
                        tanggal, 0, 0
                ));
                continue;
            }

            bulan = Integer.parseInt(inputBulan);

            System.out.print("Tahun kemerdekaan: ");
            String inputTahun = input.nextLine();

            if (inputTahun.trim().isEmpty()) {
                daftarNegara.add(new Negara(
                        nama, jenisKepemimpinan, namaPemimpin,
                        tanggal, bulan, 0
                ));
                continue;
            }

            tahun = Integer.parseInt(inputTahun);

            Negara negara = new Negara(
                    nama, jenisKepemimpinan, namaPemimpin,
                    tanggal, bulan, tahun
            );

            daftarNegara.add(negara);
        }

        for (Negara negara : daftarNegara) {
            if (negara.getJenisKepemimpinan().trim().isEmpty()) {
                System.out.println("Negara " + negara.getNama());
            } else if (negara.getNamaPemimpin().trim().isEmpty()) {
                System.out.println(negara.getNama()
                        + " pemimpinnya " + negara.getJenisKepemimpinan());
            } else {
                String jenis = negara.getJenisKepemimpinan();

                if (jenis.equalsIgnoreCase("Monarki")) {
                    jenis = "Raja";
                } else if (jenis.equalsIgnoreCase("Presiden")) {
                    jenis = "Presiden";
                } else if (jenis.equalsIgnoreCase("Perdana Menteri")) {
                    jenis = "Perdana Menteri";
                }

                System.out.println("Negara " + negara.getNama()
                        + " mempunyai " + jenis
                        + " bernama " + negara.getNamaPemimpin());

                if (negara.getTanggalKemerdekaan() > 0
                        && negara.getBulanKemerdekaan() >= 1
                        && negara.getBulanKemerdekaan() <= 12
                        && negara.getTahunKemerdekaan() > 0) {
                    System.out.println(
                            "Deklarasi Kemerdekaan pada Tanggal "
                                    + negara.getTanggalKemerdekaan() + " "
                                    + daftarBulan.get(negara.getBulanKemerdekaan()) + " "
                                    + negara.getTahunKemerdekaan()
                    );
                }
            }

            System.out.println();
        }

        input.close();
    }
}