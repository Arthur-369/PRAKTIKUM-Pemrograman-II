package PRAK203_2510817310007_MuhammadRaflyAshShadiq;


public class Pegawai {      //Memperbaiki penamaan class yang awalnya "Employee" jadi "Pegawai" karena nama class harus sama dengan nama file
                            //public class Employee --> public class Pegawai
    public String nama;
    public String asal;     //Mengganti tipe data char untuk variabel "asal" menjadi tipe data String, karena "asal" berisi teks
                            //public char asal; --> public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setJabatan(String jabatan) {    //Penambahan parameter "String jabatan" karena di Main method ini dipanggil dengan satu isi, sehingga method harus punya tempat untuk menerima nilainya
                                                //public void setJabatan() --> public void setJabatan(String jabatan)
        this.jabatan = jabatan; //j jadi jabatan, karena j tidak pernah dideklarasikan.
                                //this.jabatan = j --> this.jabatan = jabatan
    }
}
