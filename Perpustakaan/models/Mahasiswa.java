package models;
public class Mahasiswa extends User {
    private String nim;
    public Mahasiswa() {

    }
    public Mahasiswa(String nama, String telepon, String nim) {
        super(nama,telepon);
        this.nim = nim;

    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String setNim() {
        return this.nim;
    }  
}
