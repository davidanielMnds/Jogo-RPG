package personagem.ataques;

public enum AtaquesMagicos {
    BLOCO_DE_ACUCAR("Bloco de açúcar", 25, 15),
    RAJADA_MISTICA("Rajada Mística", 45, 35),
    MIASMA_PUTRIDO("Miasma Pútrido", 22, 12),
    ESPINHO_DE_OSSOS("Espinho de Ossos", 30, 18),
    NUCLEO_INSTAVEL("Núcleo Instável", 40, 26),
    PACTO_CARMESIM("Pacto Carmesim", 38, 22);

    private final String nome;
    private final int dano;
    private final int PM;

    AtaquesMagicos(String nome, int dano, int PM) {
        this.nome=nome;
        this.dano=dano;
        this.PM=PM;
    }
    public String getNome() { return nome;}
    public int getDano() { return dano;}
    public int getPM() { return PM;}

}
