package services;
import java.util.*;
import models.Buku;

public class ServiceBuku {
    ArrayList<Buku> dataBuku;

    public ServiceBuku() {
        dataBuku = new ArrayList<Buku>();
    }

    public void insertDataBuku(String judul, String penulis) {
        
        dataBuku.add(new Buku(judul, penulis));
    }
        public void showBuku()
        {
            for (Buku buku : dataBuku) {
                System.out.println("======================");
                System.out.println("No "+buku.getId()+"\n"+"Kode Buku : " + buku.getKode() + "\n" + "Judul : " + buku.getJudul() + "\n"
                        + " Penulis : " + buku.getpenulis());
                System.out.println("======================");
            }
        }
    
    // public void deleteDataBuk(String kd) {
    //     dataBuku.remove(buk);
    // }


}
