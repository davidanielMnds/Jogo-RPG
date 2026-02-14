package personagem.ataques;

public enum Cura {
    GUERREIRO (40, 10),
    MAGO (45, 25),
    ZUMBI (30, 16),
    ESQUELETO(15, 12),
    GOLEM(50, 28),
    VAMPIRO(25, 12);

    private final int Cura;
    private final int PM;

    Cura(int Cura, int PM) {
        this.Cura=Cura;
        this.PM=PM;
    }

    public int getCura() { return Cura;}
    public int getPM() { return PM;}

}
