public class Triangulo implements Figura {
    @Override
    public void desenha() {
        System.out.println("Desenhando um triângulo");
    }

    @Override
    public void mudaCorDeFundo(Cor cor) {
        System.out.println("Mudando a cor de fundo do triângulo para " + cor);
    }
}