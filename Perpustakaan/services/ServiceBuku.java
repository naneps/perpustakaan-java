package services;
import java.util.*;
import models.Buku;

public class ServiceBuku {
    ArrayList<Buku> dataBuku;

    public ServiceBuku() {
        dataBuku = new ArrayList<Buku>();
    }

    public void insertDataBuku(String judul, String penulis, String kode) {
        
        dataBuku.add(new Buku(judul, penulis, kode));
    }

        public void showBuku()
    {
        for(Buku buku:dataBuku)
        {
            System.out.println("Kode Buku : "+buku.getKode()+""+", Judul : "+buku.getJudul()+""+", Penulis : "+buku.getpenulis());
        }
    }
 

}
