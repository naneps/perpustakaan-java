package models;
public class Buku {
    private String judul;
    private String penulis;
    private String kode = "KB";
    static Integer nmr = 1;
    private Integer id = 0;
    static Integer nm = 1;
    private Kategori kategori;
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Buku(String judul , String penulis){ 
        this.judul = judul;
        this.penulis = penulis;
        this.kode += nmr++;
        this.id+=nm++;
    }
    public Buku(){ 

    }


    public String getJudul() {
        return this.judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenulis() {
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

    public Integer getId() {
        return this.id;
    }

}


    