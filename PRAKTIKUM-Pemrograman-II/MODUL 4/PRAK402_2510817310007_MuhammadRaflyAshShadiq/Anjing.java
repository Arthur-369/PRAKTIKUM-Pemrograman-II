package PRAK402_2510817310007_MuhammadRaflyAshShadiq;

public class Anjing extends HewanPeliharaan{
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(r, n);
        warnaBulu = w;
        kemampuan = k;
    }

    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);

        String hasil = "";
        for (int i = 0; i < kemampuan.length; i++) {
            if (i > 0) {
                hasil += " ";
            }
            hasil += kemampuan[i];
        }

        System.out.println("Memiliki kemampuan : " + hasil);
    }
}