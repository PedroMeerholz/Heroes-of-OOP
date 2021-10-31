public class Guerreiro extends Personagem {

    public Guerreiro(String nomePersonagem, Arma armaUtilizada){
        super(nomePersonagem, armaUtilizada);
        setPontosDeAtaque(30);
        setPontosDeDefesa(20);
        setPontosDeVida(180);
    }

    @Override
    public String toString() {
        return String.format(
            "\nVocê criou um Gurreiro(%s) com os seguintes atributos:\nPontos de Ataque: %d\nPontos de Vida: %.0f\nPontos de Defesa: %.0f",
            getNomePersonagem(), getPontosDeAtaque(), getPontosDeVida(), getPontosDeDefesa());
    }
}
