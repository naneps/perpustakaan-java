package services;
import java.util.*;

import interfaces.Tabel;
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
            Tabel tb = new Tabel();
            tb.setShowVerticalLines(true);
            tb.setHeaders("No","Kode Buku ","Judul","Penulis");
            for (Buku buku : dataBuku) {
                tb.addRow(buku.getId().toString(), buku.getKode(), buku.getJudul(), buku.getPenulis());
            }
            tb.print();
        }
        // System.out.println("======================");
        // System.out.println("No "+buku.getId()+"\n"+"Kode Buku : " + buku.getKode() + "\n" + "Judul : " + buku.getJudul() + "\n"
        //         + " Penulis : " + buku.getPenulis());
        // System.out.println("======================");
        
        public void deleteDataBuuk(String id) {

            dataBuku.remove(id);
        }


}
