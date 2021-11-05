package models;
public class Buku {
    private String judul;
    private String penulis;
    private String kode;
    private Kategori kategori;
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Buku(String judul , String penulis , String kode){ 
        this.judul = judul;
        this.penulis = penulis;
        this.kode= kode;
    }
    public Buku(){ 
    
    }


    public String getJudul() {
        return this.judul;
    }

    public void setpenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getpenulis() {
        return this.penulis;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return this.kode;
    }
    

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public Kategori getkategori() {
        return this.kategori;
    }


}


