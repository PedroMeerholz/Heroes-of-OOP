public class Personagem {
    protected String nomePersonagem;
    protected int pontosDeAtaque;
    protected float pontosDeDefesa;
    protected float pontosDeVida;

    public Personagem(String nomePersonagem) {
        setNomePersonagem(nomePersonagem);
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getNomePersonagem() {
        return this.nomePersonagem;
    }

    public void setPontosDeAtaque(int pontosDeAtaque) {
        this.pontosDeAtaque = pontosDeAtaque;
    }

    public int getPontosDeAtaque() {
        return this.pontosDeAtaque;
    }

    public void setPontosDeDefesa(float pontosDeDefesa) {
        this.pontosDeDefesa = pontosDeDefesa;
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
}
