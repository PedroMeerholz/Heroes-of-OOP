public abstract class Personagem  implements AcoesPersonagem {
    protected String nomePersonagem;
    protected int pontosDeAtaque;
    protected float pontosDeDefesa;
    protected float pontosDeVida;
    protected Arma armaUtilizada;

    public Personagem(String nomePersonagem, Arma armaUtilizada) {
        setNomePersonagem(nomePersonagem);
        setArmaUtilizada(armaUtilizada);
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getNomePersonagem() {
        return this.nomePersonagem;
    }

    public void setPontosDeAtaque(int pontosDeAtaque) {
        this.pontosDeAtaque = pontosDeAtaque + armaUtilizada.getAdicionalAtaque();
    }

    public int getPontosDeAtaque() {
        return this.pontosDeAtaque;
    }

    public void setPontosDeDefesa(float pontosDeDefesa) {
        this.pontosDeDefesa = pontosDeDefesa + armaUtilizada.getAdicionalDefesa();
    }

    public float getPontosDeDefesa() {
        return this.pontosDeDefesa;
    }

    public void setPontosDeVida(float pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public float getPontosDeVida() {
        return this.pontosDeVida;
    }

    public void setArmaUtilizada(Arma armaUtilizada) {
        this.armaUtilizada = armaUtilizada;
    }

    public String getArmaUtilizada() {
        return armaUtilizada.getNomeArma();
    }

    @Override
    public void atacar(Personagem atacante, Personagem alvo) {
        float dano = atacante.getPontosDeAtaque() - alvo.getPontosDeDefesa();

        float vidaAlvo = alvo.getPontosDeVida() - dano;
        alvo.setPontosDeVida(vidaAlvo);

        System.out.printf("\nO personagem %s, atacou %s!\nDano Causado: %.1f\nVida atual de %s: %.1f\n", atacante.nomePersonagem, alvo.nomePersonagem, dano, alvo.nomePersonagem, alvo.pontosDeVida);
    }

    @Override
    public void defender() {
        this.pontosDeDefesa += (pontosDeDefesa * 0.1);
        System.out.printf("O personagem %s, obteve um aumento de 10%% em seus pontos de defesa durante esse turno", this.nomePersonagem);
    }
}