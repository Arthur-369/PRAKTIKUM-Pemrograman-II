import java.util.Scanner;

public class PRAK101_2510817310007_MuhammadRaflyAshShadiq {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempat = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggi = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double berat = input.nextDouble();

        String nama_bulan = "";

        switch (bulan) {
            case 1: nama_bulan = "Januari"; break;
            case 2: nama_bulan = "Februari"; break;
            case 3: nama_bulan = "Maret"; break;
            case 4: nama_bulan = "April"; break;
            case 5: nama_bulan = "Mei"; break;
            case 6: nama_bulan = "Juni"; break;
            case 7: nama_bulan = "Juli"; break;
            case 8: nama_bulan = "Agustus"; break;
            case 9: nama_bulan = "September"; break;
            case 10: nama_bulan = "Oktober"; break;
            case 11: nama_bulan = "November"; break;
            case 12: nama_bulan = "Desember"; break;
        }

        System.out.printf("Nama Lengkap %s, Lahir di %s pada Tanggal %d %s %d\n", nama, tempat, tanggal, nama_bulan, tahun);
        System.out.printf("Tinggi Badan %d cm dan Berat Badan %.2f kilogram", tinggi, berat);
    }
}