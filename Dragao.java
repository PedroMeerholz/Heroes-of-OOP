public class Dragao extends Personagem {

    public Dragao(String nomePersonagem, Arma armaUtilizada) {
        super("LazyProg", new Garra());
        setPontosDeAtaque(30);
        setPontosDeDefesa(30);
        setPontosDeVida(300);
    }

    @Override
    public void atacar(Personagem atacante, Personagem alvo) {
        float dano = atacante.getPontosDeAtaque() - alvo.getPontosDeDefesa();

        if(dano > 0) {
            float vidaAlvo = alvo.getPontosDeVida() - dano;
            alvo.setPontosDeVida(vidaAlvo);
            System.out.printf("\n\nO personagem %s, atacou %s!\nDano Causado: %.1f\nVida atual de %s: %.1f\n", atacante.nomePersonagem, alvo.nomePersonagem, dano, alvo.nomePersonagem, alvo.pontosDeVida);
        } else {
            System.out.printf("\n\nO personagem %s, não causou nenhum dano", atacante.nomePersonagem);
        }
    }
}
