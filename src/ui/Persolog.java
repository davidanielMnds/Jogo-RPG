package ui;
import personagem.Pessoa;

public class Persolog {

    public static void msg(String msg) { System.out.print("[PersoLog]" + msg);}
    public static void msgln(String msg) { System.out.println("[PersoLog]" + msg);}
    public static void linha() { System.out.println();}
    public static void showinfo(Pessoa perso) {
        Persolog.msgln("--------" + perso.getNome() + "--------");
        Persolog.msgln("Vida: " + perso.getVida());
        Persolog.msgln("Mana: " + perso.getMana());
        Persolog.msgln("Estado atual: " + perso.VerificarEstado());
        Persolog.linha();
    }
//info ataques
    public static void getInfoAtaques(Pessoa perso) {
        Persolog.linha();
        Persolog.msgln("Ataque físico: " + perso.getNomeAtaqueFisico());
        Persolog.msgln("Ataque mágico: " + perso.getNomeAtaqueMagico());
        Persolog.msgln("Cura: " + perso.getCura());
    }
//info ataque fisico
    public  void getInfoAtaqueFisico(Pessoa perso) {
        Persolog.msg(perso.getNomeAtaqueFisico() +
        ": dano = " + perso.getDanoAtaqueFisico());
    }
// info ataque magico
    public static void getInfoAtaqueMagico(Pessoa perso) {
        Persolog.msg(perso.getNomeAtaqueMagico() +
        ": dano = " + perso.getDanoAtaqueMagico() +
        ": PM necessário = " + perso.getAtaqueMagicoPM());
    }
// info cura
    public static void getInfoCura(Pessoa perso) {
        Persolog.msg("Cura = " + perso.getCura() +
        " : PM necessário = " + perso.getCuraPM());
    }
// info Estado
    public static void getInfoEstado(Pessoa perso) {
        Persolog.msg(perso.getNome());
        switch(perso.getEstado()) {
            case VIVO -> Persolog.msgln(" está vivo");
            case MACHUCADO -> Persolog.msgln(" está machucado.");
            case MORTO -> Persolog.msgln(" está morto");
        }
    }

}
