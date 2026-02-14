package personagem.classes;
import personagem.Pessoa;
import personagem.ataques.AtaquesFisicos;
import personagem.ataques.AtaquesMagicos;
import personagem.ataques.Cura;

public class Esqueleto extends Pessoa{
    public Esqueleto(String Nome) {
        super(
            Nome,
            Tipo.ESQUELETO,
            Tipo.ESQUELETO.getPVmaximo(),
            Tipo.ESQUELETO.getPMmaximo(),
            AtaquesFisicos.QUEBRA_COLUNA,
            AtaquesMagicos.ESPINHO_DE_OSSOS,
            Cura.ESQUELETO
        );
    }
}
