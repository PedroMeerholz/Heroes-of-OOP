import java.util.ArrayList;
import java.util.Random;

public class Dragao extends Personagem {

    public Dragao() {
        super();
        setPontosDeAtaque(30);
        setPontosDeDefesa(30);
        setPontosDeVida(300);
        setNomePersonagem("LazyProg");
    }
    
    public int alvoDragao(ArrayList<Personagem> arrayList) {;
        Random escolheAlvo = new Random();
        int alvo = escolheAlvo.nextInt(arrayList.size());
        
        return alvo;
    }

    @Override
    public void atacar(Personagem atacante, Personagem alvo) {
        float dano = atacante.getPoderDeAtaque() - alvo.getPoderDeDefesa();

        if(dano > 0) {
            float vidaAlvo = alvo.getPontosDeVida() - dano;
            alvo.setPontosDeVida(vidaAlvo);
            System.out.printf("\n\nO personagem %s, atacou %s!\nDano Causado: %.1f\nVida atual de %s: %.1f", atacante.nomePersonagem, alvo.nomePersonagem, dano, alvo.nomePersonagem, alvo.pontosDeVida);
        } else {
            System.out.printf("\n\nO personagem %s, não causou nenhum dano", atacante.nomePersonagem);
        }
    }
}
