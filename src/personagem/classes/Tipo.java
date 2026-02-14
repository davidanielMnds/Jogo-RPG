package personagem.classes;
import java.util.List;
public enum Tipo {
    ZUMBI,
    ESQUELETO,
    GOLEM,
    VAMPIRO,
    GUERREIRO,
    MAGO;

    private List<Tipo> forteContra;
    private List<Tipo> fracoContra;
    private int PV;
    private int PM;

    static {
        //================== GUERREIRO ==================
        GUERREIRO.forteContra=List.of(ZUMBI, ESQUELETO);
        GUERREIRO.fracoContra=List.of(GOLEM, VAMPIRO);
        GUERREIRO.PV=110;
        GUERREIRO.PM=50;
        //================== GUERREIRO ==================

        //================== MAGO ==================
        MAGO.forteContra=List.of(VAMPIRO, GOLEM);
        MAGO.fracoContra=List.of(ZUMBI, ESQUELETO);
        MAGO.PV=70;
        MAGO.PM=130;
        //================== MAGO ==================

        //================== ZUMBI ==================
        ZUMBI.forteContra=List.of(MAGO);
        ZUMBI.fracoContra=List.of(GUERREIRO);
        ZUMBI.PV=140;
        ZUMBI.PM=30;
        //================== ZUMBI ==================

        //================== ESQUELETO ==================
        ESQUELETO.forteContra=List.of(MAGO);
        ESQUELETO.fracoContra=List.of(GUERREIRO);
        ESQUELETO.PV=120;
        ESQUELETO.PM=40;
        //================== ESQUELETO ==================

        //================== VAMPIRO ==================
        VAMPIRO.forteContra=List.of(GUERREIRO);
        VAMPIRO.fracoContra=List.of(MAGO);
        VAMPIRO.PV=90;
        VAMPIRO.PM=110;
        //================== VAMPIRO ==================

        //================== GOLEM ==================
        GOLEM.forteContra=List.of(GUERREIRO);
        GOLEM.fracoContra=List.of(MAGO);
        GOLEM.PV=80;
        GOLEM.PM=120;
        //================== GOLEM ==================
        

    }

    public boolean eForte(Tipo outro) {
        return forteContra.contains(outro);
    }

    public boolean eFraco(Tipo outro) {
        return fracoContra.contains(outro);
    }

    public int getPVmaximo() { return PV;}
    public int getPMmaximo() { return PM;}
    

}
