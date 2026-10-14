package PRAK301_2510817310007_MuhammadRaflyAshShadiq;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lempar beberapa dadu: ");

        int jumlahDadu = input.nextInt();
        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        int total = 0;

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daftarDadu.add(dadu);
        }
        System.out.println("\nHasil Lemparan:");

        for (int i = 0; i < daftarDadu.size(); i++) {
            int nilai = daftarDadu.get(i).getNilai();

            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilai);
            total += nilai;
        }

        System.out.println("Total nilai dadu: " + total);
        input.close();
    }
}