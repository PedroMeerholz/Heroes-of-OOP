public class Mago extends Personagem {

    public Mago(String nomePersonagem, Arma armaUtilizada){
        super(nomePersonagem, armaUtilizada);
        setPontosDeAtaque(20);
        setPontosDeDefesa(10);
        setPontosDeVida(200);
    }
}
