package models;
import java.util.Scanner;

public class MainMenu {
    static int pilihan;
    static Scanner scr = new Scanner(System.in);
    static MenuBuku menuBuku = new MenuBuku();
    public static void showMainMenu() {
        System.out.println("====Main Menu ====");
        System.out.println("1.Data Buku");
        System.out.println("2.Data Mahasiswa");
        System.out.println("3.Data Peminjaman");
        System.out.println("4.Data Mahasiswas");
        System.out.println("==================");
        System.out.print("Pilih Menu [1-4] : ");
        pilihan = scr.nextInt();
            switch (pilihan) {
            case 1:
            System.out.print("\033[H\033[2J");
            System.out.flush();
            menuBuku.showMenu();
            break;
        case 2:
            System.out.println("Peminjaman");
            break;
        case 3:
            System.out.println("Pengembalian");
            break;
        default:
            System.out.println("Pilihan Salah");
            break;
        }
    }
}
