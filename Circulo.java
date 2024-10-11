public class Circulo implements Figura {
    @Override
    public void desenha() {
        System.out.println("Desenhando um círculo");
    }

    @Override
    public void mudaCorDeFundo(Cor cor) {
        System.out.println("Mudando a cor de fundo do círculo para " + cor);
    }
}