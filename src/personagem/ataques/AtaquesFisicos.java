package personagem.ataques;
public enum AtaquesFisicos {
    MACHADADA_BRUTAL("Machadada Brutal", 34),
    GOLPE_IMPROVISADO("Golpe Improvisado", 18),
    MORDIDA_INFECTADA("Mordida Infectada", 30),
    QUEBRA_COLUNA("Quebra Coluna", 38),
    IMPACTO_ROCHOSO("Impacto Rochoso", 24),
    DILACERAR("Dilacerar", 28);


    private final String nome;
    private final int dano;
    AtaquesFisicos(String nome, int dano) {
        this.nome=nome;
        this.dano=dano;
    }
    public String getNome() { return nome;}
    public int getDano() { return dano;}
}