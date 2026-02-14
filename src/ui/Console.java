package ui;

import java.io.IOException;

public class Console {
    public static void linha() {
        System.out.println();
    }
    public static void msg(String msg) { System.out.print("[Console]" + msg);}
    public static void msgln(String msg) { System.out.println("[Console]" +msg);}

    public static void limparCMD() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            System.out.println("\n".repeat(50));
        }
    }

    public static void msgErro(String msg) {
        System.out.println("[AVISO] " + msg);
    }
}
