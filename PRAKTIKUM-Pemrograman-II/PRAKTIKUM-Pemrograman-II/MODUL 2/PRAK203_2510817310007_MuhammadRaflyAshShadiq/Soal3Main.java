package PRAK203_2510817310007_MuhammadRaflyAshShadiq;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";    //Pennambahan ";" karena tidak ada
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        p1.umur = 17;     //Menambahkan nilai untuk atribut "umur", karena sebelumnya tidak diisi sehingga akan tampil 0

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur);
    }
}
