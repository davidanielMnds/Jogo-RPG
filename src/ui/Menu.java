package ui;

import java.util.Scanner;
import personagem.*;
import personagem.classes.*;

public class Menu {

    public static void msg(String msg) { System.out.print("[MENU]" + msg);}
    public static void msgln(String msg) { System.out.println("[MENU]" +msg);}
    public static void linha() { System.out.println();}

    public static Pessoa menuBemVindo(Scanner sc) {
        Menu.msgln("####################### Seja Bem vindo! #######################");
        String nome;
        do{
            Menu.msg("Digite o nome do seu jogador: ");
            nome = sc.nextLine();
        } while (nome.isBlank());
        while(true) {
        Menu.msgln("Escolha uma das classes:");
        Menu.msgln("[1] Guerreiro");
        Menu.msgln("[2] Mago");
        Menu.msg("Digite: ");
        char escolha = sc.nextLine().charAt(0);
        switch (escolha) {
            case '1' -> {return new Guerreiro(nome);}
            case'2' -> {return new Mago(nome);}
            default -> Menu.msgln("Digite uma opção válida.");
        }
        }
    }

    public static void getMenu() {
        Menu.msgln("==================================");
        Menu.msgln("Selecione uma opção: ");
        Menu.msgln("[1] Ataque Físico");
        Menu.msgln("[2] Ataque mágico");
        Menu.msgln("[3] Cura");
        Menu.msgln("[4] Ver informações de ataque");
        Menu.msg("Digite: ");
    }

    public static void continuar(Scanner sc) {
        Menu.linha();
        Menu.msg("Pressione enter para continuar");
        sc.nextLine();
    }

    public static void gameOver(Scanner sc, Pessoa pessoa) {
        Console.limparCMD();
        Menu.msgln("O jogo acabou!");
        Menu.msgln(pessoa.getNome() + " morreu.");
        Menu.msg("Pressione enter para encerrar");
        sc.nextLine();
    }
}
