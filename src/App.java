import acoes.*;
import batalha.*;
import factory.GeradorInimigos;
import java.util.Scanner;
import personagem.*;
import ui.*;

public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Pessoa jogador = Menu.menuBemVindo(sc);
    Pessoa inimigo = GeradorInimigos.GerarInimigo();
    Combate combate = new Combate();
    char escolha;
    Console.limparCMD();
    while (jogador.getEstado() != Estado.MORTO && inimigo.getEstado() != Estado.MORTO) {
        Acao acaoJogador=null;
        Persolog.showinfo(jogador);
        Persolog.showinfo(inimigo);

        Menu.getMenu();
        escolha = sc.nextLine().charAt(0);
        switch(escolha) {
            case '1' ->  acaoJogador = new AcaoAtaqueFisico();
            case '2' ->  acaoJogador = new AcaoAtaqueMagico();
            case '3' ->  acaoJogador = new AcaoCurar();
            case '4' -> Persolog.getInfoAtaques(jogador);
        }
        if (acaoJogador!=null) {
            combate.ExecutarTurno(acaoJogador, jogador, inimigo);
        }
        Menu.continuar(sc);
        Console.limparCMD();
    }
    if(jogador.getEstado()==Estado.MORTO) {
        Menu.gameOver(sc, jogador);
    }
    if (inimigo.getEstado()==Estado.MORTO) {
        Menu.gameOver(sc, inimigo);
    }
    }
}
