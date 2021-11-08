package services;
import java.util.Scanner;
public class Tools {
  public static Scanner input  = new Scanner(System.in);
    public static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }
    public static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }
}
