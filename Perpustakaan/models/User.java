package models;
public abstract class User {
    private String nama ;
    private String telepon;

    public User(String nama ,String telepon) {
        this.nama =nama ;
        this.telepon = telepon;
    }
    public User() {  
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getTelepon() {
        return this.telepon;
    }

}
