package models;

import services.ServiceBuku;
import java.util.*;
public class MenuBuku  implements Menu{
    static Scanner scr = new Scanner(System.in);
    static ServiceBuku buku = new ServiceBuku();
    static Buku bk = new Buku();
    static int pilihan;
    static int jml;
    @Override
    public void showMenu() {
        // TODO Auto-generated method stub
      System.out.println("=== Sub Menu === ");
        System.out.println("1. Daftar Buku");
        System.out.println("2. Tambah Data ");
        System.out.println("3. Hapus Data");
        System.out.println("4. Menu Utama");
        System.out.print("Pilih :[1-3] : ");
        pilihan = scr.nextInt();
            switch (pilihan) {
            case 1:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("==== Daftar Buku ====");
                buku.showBuku();
                break;
            case 2:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("==== Tambah Buku ====");
                System.out.print("Jumlah Buku :");
                jml = scr.nextInt();
                
                for (int i = 1; i <= jml; i++) {
                    System.out.println("Masukan Data Buku ke "+i);
                    System.out.print("Kode Buku :");
                    String kd = scr.next();
                    System.out.print("Judul Buku :");
                    String jdl = scr.next();
                    System.out.print("Penulis Buku :");
                    String pnls = scr.next();
                    buku.insertDataBuku(kd, pnls,jdl);
                }
                buku.showBuku();
            
                break;
            case 3:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("==== Hapus Buku ====");
                break;
            default:
                System.out.println("Pilihan Salah");
                break;
            }    
    }
    public static void showMenuBuku() {
    
    }

    public static void showMenuMhs() {
    
    }
}
