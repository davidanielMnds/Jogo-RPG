package personagem;
import batalha.Batalha;
import personagem.ataques.*;
import personagem.classes.Tipo;
import ui.Console;
public abstract class Pessoa implements Batalha{
    private String Nome;
    private int PV;
    private int PM;
    private Estado EstadoAtual;
    private final Tipo Classe;
    private final AtaquesFisicos ataqueFisico;
    private final AtaquesMagicos ataqueMagico;
    private final Cura cura;
    
    public Pessoa(
        String Nome,
        Tipo Classe,
        int PV,
        int PM,
        AtaquesFisicos ataqueFisico,
        AtaquesMagicos ataqueMagico,
        Cura cura
        )
    {
        this.Nome = Nome;
        this.PV = PV;
        this.PM = PM;
        this.EstadoAtual = Estado.VIVO;
        this.Classe = Classe;
        this.ataqueFisico = ataqueFisico;
        this.ataqueMagico = ataqueMagico;
        this.cura=cura;
    }
//----------------- getts---------------------------------//
    public String getNome() { return Nome;}
    public int getVida() { return PV;}
    public int getMana() { return PM;}
    public Tipo getTipo() { return Classe;}
//cura
    public Estado getEstado() { return EstadoAtual;}
    public int getCura() { return cura.getCura();}
    public int getCuraPM() { return cura.getPM();}
//ataque fisico
    public String getNomeAtaqueFisico() { return ataqueFisico.getNome();}
    public int getDanoAtaqueFisico() { return ataqueFisico.getDano();}
//ataque magico
    public String getNomeAtaqueMagico() { return ataqueMagico.getNome();}
    public int getDanoAtaqueMagico() { return ataqueMagico.getDano();}
    public int getAtaqueMagicoPM() { return ataqueMagico.getPM();}
    
//-----------------setts---------------------------------//
    public void setNome(String SETnome) { Nome=SETnome;}

//-----------------Modificações---------------------------------//
    public void addMana(int ADDmana) {
        if(ADDmana <= 0) { Console.msgErro("A mana tem que ser positiva"); return;}
        PM+=ADDmana;
    }
    public void redMana(int REDmana) {
        if (PM - REDmana < 0) {
            Console.msgErro("A mana não pode ser menor que 0");
            return;
        }
        PM-=REDmana;
    }
    public void addVida(int add) {
        if (add>0) {PV+=add; return;}
        Console.msgErro("O número a ser somado deve ser positivo");
    }
//-----------------VERIFICAR ESTADO---------------------------------//
    public Estado VerificarEstado() {
        if(PV >= Classe.getPVmaximo() / 2) {
            EstadoAtual = Estado.VIVO;
        }
        else if (PV <= Classe.getPVmaximo() / 2 && PV >= 1) {
            EstadoAtual = Estado.MACHUCADO;
        }
        else {EstadoAtual = Estado.MORTO;
        }
        return EstadoAtual;
    }
//-----------------LEVAR DANO---------------------------------//
    public void LevarDano(int dano) {
        if (PV - dano < 0) { PV=0;}
        else {PV-=dano;}
        VerificarEstado();
    }
// Ataque Físico
    @Override
    public int AtaqueFisico(Tipo inimigo) {
        if (Classe.eForte(inimigo)) {
            return ataqueFisico.getDano();
        }
        return ataqueFisico.getDano() / 2;
    }
// Ataque Mágico
    @Override
    public int AtaqueMagico(Tipo inimigo) {
        if (getMana() < ataqueMagico.getPM()) {
            Console.linha();
            Console.msgErro(Nome + " tentou usar " + ataqueMagico.getNome() + " mas não tem PM o suficiente.");
            return 0;
        }
        redMana(ataqueMagico.getPM());
        if(Classe.eForte(inimigo)) {
            return ataqueMagico.getDano();
        }
        return ataqueMagico.getDano() / 2;
    }
// curar
    @Override
    public void Curar() {
        if (getMana() - cura.getPM() <= -1) {
            Console.linha();
            Console.msgErro(getNome() + " tentou usar cura, mas não tem mana");
            return;
        }
        redMana(cura.getPM());
        addVida(cura.getCura());
        VerificarEstado();
    }
}