package PRAK303_2510817310007_MuhammadRaflyAshShadiq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("\nPilihan: ");

            pilihan = Integer.parseInt(input.nextLine());
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.nextLine();

                    boolean nimAda = false;
                    for (Mahasiswa m : daftarMahasiswa) {
                        if (m.getNim().equals(nim)) {
                            nimAda = true;
                            break;
                        }
                    }

                    if (nimAda) {
                        System.out.println("NIM sudah terdaftar.");
                    } else {
                        daftarMahasiswa.add(new Mahasiswa(nama, nim));
                        System.out.println(
                                "Mahasiswa " + nama + " ditambahkan."
                        );
                    }
                    break;

                case 2:
                    System.out.print(
                            "Masukkan NIM Mahasiswa yang akan dihapus: "
                    );
                    String nimHapus = input.nextLine();

                    boolean terhapus = false;

                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        if (daftarMahasiswa.get(i).getNim().equals(nimHapus)) {
                            daftarMahasiswa.remove(i);
                            terhapus = true;
                            break;
                        }
                    }

                    if (terhapus) {
                        System.out.println(
                                "Mahasiswa dengan NIM " + nimHapus + " dihapus."
                        );
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print(
                            "Masukkan NIM Mahasiswa yang dicari: "
                    );
                    String nimCari = input.nextLine();

                    HashMap<String, Mahasiswa> dataMahasiswa = new HashMap<>();

                    for (Mahasiswa m : daftarMahasiswa) {
                        dataMahasiswa.put(m.getNim(), m);
                    }

                    Mahasiswa hasil = dataMahasiswa.get(nimCari);

                    if (hasil != null) {
                        System.out.println("NIM: " + hasil.getNim()
                                + ", Nama: " + hasil.getNama());
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");

                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Belum ada data mahasiswa.");
                    } else {
                        for (Mahasiswa m : daftarMahasiswa) {
                            System.out.println("NIM: " + m.getNim()
                                    + ", Nama: " + m.getNama());
                        }
                    }
                    break;

                case 0:
                    daftarMahasiswa.clear();
                    System.out.println("Terima Kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

            System.out.println();

        } while (pilihan != 0);

        input.close();
    }
}