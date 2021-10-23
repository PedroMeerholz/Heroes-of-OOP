public class Personagem {
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
}