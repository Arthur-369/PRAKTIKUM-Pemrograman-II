import java.util.Scanner;

public class PRAK105_2510817310007_MuhammadRaflyAshShadiq {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double jari = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        double volume_tabung = PI * jari * jari * tinggi;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", jari, tinggi, volume_tabung);
    }
}