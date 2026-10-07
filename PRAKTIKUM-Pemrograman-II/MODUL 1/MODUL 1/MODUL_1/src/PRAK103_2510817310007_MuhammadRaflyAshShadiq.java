import java.util.Scanner;

public class PRAK103_2510817310007_MuhammadRaflyAshShadiq {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        int n = input.nextInt();

        System.out.print("Masukkan angka awal: ");
        int angka = input.nextInt();

        int jumlah = 0;

        do {
            if (angka % 2 != 0) {
                System.out.print(angka + ",");
                jumlah++;
            }

            angka++;
        } while (jumlah < n);
    }
}