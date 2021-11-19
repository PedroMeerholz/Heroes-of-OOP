public class Mago extends Personagem {

    public Mago(){
        super();
        setPontosDeAtaque(20);
        setPontosDeDefesa(10);
        setPontosDeVida(200);
    }

    @Override
    public String toString() {
        return String.format(
            "\nVocê criou um Mago(%s) com os seguintes atributos:\nPontos de Ataque: %d\nPontos de Vida: %.0f\nPontos de Defesa: %.0f",
            getNomePersonagem(), getPontosDeAtaque(), getPontosDeVida(), getPontosDeDefesa());
    }
}
