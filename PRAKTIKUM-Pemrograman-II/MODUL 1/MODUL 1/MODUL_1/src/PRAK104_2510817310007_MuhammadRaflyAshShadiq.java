import java.util.Scanner;

public class PRAK104_2510817310007_MuhammadRaflyAshShadiq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String[] abu = input.nextLine().split(" ");

        System.out.print("Tangan Bagas: ");
        String[] bagas = input.nextLine().split(" ");

        int poinAbu = 0;
        int poinBagas = 0;
        for (int i = 0; i < 3; i++) {
            if ((abu[i].equals("B") && bagas[i].equals("G")) ||
                    (abu[i].equals("G") && bagas[i].equals("K")) ||
                    (abu[i].equals("K") && bagas[i].equals("B"))) {
                poinAbu++;
            } else if ((bagas[i].equals("B") && abu[i].equals("G")) ||
                    (bagas[i].equals("G") && abu[i].equals("K")) ||
                    (bagas[i].equals("K") && abu[i].equals("B"))) {
                poinBagas++;
            }
        }

        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}