public class Arqueiro extends Personagem {

    public Arqueiro(String nomePersonagem, Arma armaUtilizada) {
        super(nomePersonagem, armaUtilizada);
        setPontosDeAtaque(20);
        setPontosDeDefesa(30);
        setPontosDeVida(160);
    }

    @Override
    public String toString() {
        return String.format(
            "\nVocê criou um Arqueiro(%s) com os seguintes atributos:\nPontos de Ataque: %d\nPontos de Vida: %.0f\nPontos de Defesa: %.0f",
            getNomePersonagem(), getPontosDeAtaque(), getPontosDeVida(), getPontosDeDefesa());
    }
}
