package personagem.classes;
import personagem.Pessoa;
import personagem.ataques.AtaquesFisicos;
import personagem.ataques.AtaquesMagicos;
import personagem.ataques.Cura;

public class Mago extends Pessoa{
    public Mago(String Nome) {
        super(
            Nome,
            Tipo.MAGO,
            Tipo.MAGO.getPVmaximo(),
            Tipo.MAGO.getPMmaximo(),
            AtaquesFisicos.GOLPE_IMPROVISADO,
            AtaquesMagicos.RAJADA_MISTICA,
            Cura.ESQUELETO
        );
    }
}