public class Arma {
    protected int adicionalAtaque;
    protected int adicionalDefesa;

    public Arma() {

    }

    public void setAdicionalAtaque(int adicionalAtaque) {
        this.adicionalAtaque = adicionalAtaque;
    }

    public int getAdicionalAtaque(){
        return this.adicionalAtaque;
    }

    public void setAdicionalDefesa(int adicionalDefesa) {
        this.adicionalDefesa = adicionalDefesa;
    }

    public int getAdicionalDefesa(){
        return this.adicionalDefesa;
    }
}
