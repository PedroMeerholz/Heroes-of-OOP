public class Guerreiro extends Personagem {

    public Guerreiro(String nomePersonagem, Arma armaUtilizada){
        super(nomePersonagem, armaUtilizada);
        setPontosDeAtaque(30);
        setPontosDeDefesa(20);
        setPontosDeVida(180);
    }
}
