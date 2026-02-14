package ui;

import personagem.Estado;
import personagem.Pessoa;

public final class Battlelog {
    public static void msgln(String msg) { System.out.println("[Battlelog] " + msg);}
    public static void msg(String msg) { System.out.print("[Battlelog] " + msg);}
    public static void dano(int dano) { System.out.println("[Battlelog] " + "dano: " + dano);}
    public static void estado(String estado) {System.out.println("[Battlelog " + estado);}
    public static void linha() { System.out.println();}
    

// usou ataque fisico
    public static void UsouAtaqueFisico(Pessoa perso) {
        Battlelog.msgln(perso.getNome() + " usou " + perso.getNomeAtaqueFisico());
    }
// usou ataque magico
    public static void UsouAtaqueMagico(Pessoa perso) {
        Battlelog.msgln( perso.getNome() + " usou " + perso.getNomeAtaqueMagico());
    }
// usou cura
    public static void UsouCura(Pessoa perso) {
        Battlelog.msgln(perso.getNome() + " usou cura");
    }
// recuperou vida
    public static void QuantidadeCurada(int vida) {
        Battlelog.msgln("Quantidade de vida curada: " + vida);
    }
// mudanca estado
    public static void MudancaEstado(Pessoa perso, Estado antes) {
        Battlelog.msgln(perso.getNome() + " saiu de " + antes + " para " + perso.getEstado());
    }
}
