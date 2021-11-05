import java.util.*;

import models.MainMenu;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("======= Sistem Perpustakaan =======");
        MainMenu.showMainMenu();
        System.out.print("Lanjut? ? (y/t)");
            char prt = scr.next().charAt(0);
            if( prt == 'y' || prt == 'Y'){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                MainMenu.showMainMenu();
            } else {
                System.out.println("exitttt");
            }
                
    }
}