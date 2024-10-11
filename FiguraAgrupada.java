import java.util.ArrayList;
import java.util.List;

public class FiguraAgrupada implements Figura {
    private List<Figura> figuras = new ArrayList<>();

    public void adicionar(Figura fig) {
        figuras.add(fig);
    }

    public void remover(Figura fig) {
        figuras.remove(fig);
    }

    @Override
    public void desenha() {
        for (Figura fig : figuras) {
            fig.desenha();
        }
    }

    @Override
    public void mudaCorDeFundo(Cor cor) {
        for (Figura fig : figuras) {
            fig.mudaCorDeFundo(cor);
        }
    }
}

