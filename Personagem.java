public abstract class Personagem  implements AcoesPersonagem {
    protected String nomePersonagem;
    protected Arma armaUtilizada;
    protected int pontosDeAtaque;
    protected int adicionalAtaque;
    protected int poderDeAtaque;
    protected float pontosDeDefesa;
    protected float adicionalDefesa;
    protected float poderDeDefesa;
    protected float pontosDeVida;

    public Personagem() {

    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getNomePersonagem() {
        return this.nomePersonagem;
    }

    public void setArmaUtilizada(Arma armaUtilizada) {
        this.armaUtilizada = armaUtilizada;
    }

    public String getArmaUtilizada() {
        return armaUtilizada.getNomeArma();
    }

    public void setAdicionalAtaque() {
        this.adicionalAtaque = this.armaUtilizada.getAdicionalAtaque();
    }

    public void setPontosDeAtaque(int pontosDeAtaque) {
        this.pontosDeAtaque = pontosDeAtaque;
    }

    public int getPontosDeAtaque() {
        return this.pontosDeAtaque;
    }

    public void setPoderDeAtaque() {
        this.poderDeAtaque = this.pontosDeAtaque + this.adicionalAtaque;
    }

    public int getPoderDeAtaque() {
        return this.poderDeAtaque;
    }

    public void setPontosDeDefesa(float pontosDeDefesa) {
        this.pontosDeDefesa = pontosDeDefesa;
    }

    public float getPontosDeDefesa() {
        return this.pontosDeDefesa;
    }

    public void setAdicionalDefesa() {
        this.adicionalDefesa = this.armaUtilizada.getAdicionalDefesa();
    }

    public void setPoderDeDefesa() {
        this.poderDeDefesa = this.pontosDeDefesa + this.adicionalDefesa;
    }

    public float getPoderDeDefesa() {
        return this.poderDeDefesa;
    }

    public void setPontosDeVida(float pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public float getPontosDeVida() {
        return this.pontosDeVida;
    }

    @Override
    public void atacar(Personagem atacante, Personagem alvo) {
        float dano = atacante.getPoderDeAtaque() - alvo.getPontosDeDefesa();

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