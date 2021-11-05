package models;

import java.lang.Runtime;
import services.ServiceBuku;
import java.util.*;
public class MenuBuku  implements Menu{
    static Scanner scr = new Scanner(System.in);
    static ServiceBuku servBuku = new ServiceBuku();
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
        System.out.print("Pilih (1-3) : ");
        pilihan = scr.nextInt();
            switch (pilihan) {
            case 1:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("==== Daftar Buku ====");
                servBuku.showBuku();
                break;
            case 2:

                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("==== Tambah Buku ====");
                System.out.print("Jumlah Buku : ");
                jml = scr.nextInt();
                for (int i = 1; i <= jml; i++) {
                    System.out.println("Masukan Data Buku ke "+i);;
                    System.out.print("Judul Buku :");
                    String jdl = scr.next();
                    System.out.print("Penulis Buku :");
                    String pnls = scr.next();
                    servBuku.insertDataBuku(pnls,jdl);
                }
                break;
            case 3:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("==== Hapus Buku ====");
                break;
            case 4:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                MainMenu.showMainMenu();
                break;
            default:
                System.out.println("Pilihan Salah");
                break;
            }    
    }
}
