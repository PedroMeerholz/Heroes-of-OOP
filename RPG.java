import java.util.ArrayList;

public class RPG {
    public static void main(String[] args) {
        InterfaceInicial menu = new InterfaceInicial();
        InterfaceJogo interfaceJogo = new InterfaceJogo();
        int menuInicial = menu.menuInicial();
        int menuSecundario;
        int menuSelecaoDeClasse;
        int menuSelecionaArma;
        Personagem guerreiro = new Guerreiro("", new Machado());
        Personagem mago = new Mago("", new Varinha());
        Personagem arqueiro = new Arqueiro("J", new ArcoLongo());
        Dragao dragao = new Dragao("LazyProg", new Garra());
        ArrayList<Personagem> personagens = new ArrayList<Personagem>();
        
        while(personagens.size() < 3) {
            if(menuInicial == 1) {
                menuSecundario = menu.menuSecundario();
                String nomePersonagem = menu.selecionaNomePersonagem();
    
                if(menuSecundario == 1) {
                    menuSelecaoDeClasse = menu.menuSelecaoDeClasse();
    
                    if(menuSelecaoDeClasse == 1) {
                        menuSelecionaArma = menu.menuSelecionaArmaGuerreiro();
    
                        if(menuSelecionaArma == 1) {
                            guerreiro = new Guerreiro(nomePersonagem, new Espada());
                        } else {
                            guerreiro = new Guerreiro(nomePersonagem, new Machado());
                        } // Fim if/else selecionaArma
                        personagens.add(guerreiro);
                        System.out.println(guerreiro);
                    } else if(menuSelecaoDeClasse == 2) {
                        menuSelecionaArma = menu.menuSelecionaArmaMago();
    
                        if(menuSelecionaArma == 1) {
                            mago = new Mago(nomePersonagem, new Varinha());
                        } else {
                            mago = new Mago(nomePersonagem, new Cajado());
                        } // Fim if/else selecionaArma
                        personagens.add(mago);
                        System.out.println(mago);
                    } else {
                        menuSelecionaArma = menu.menuSelecionaArmaArqueiro();
    
                        if(menuSelecionaArma == 1) {
                            arqueiro = new Arqueiro(nomePersonagem, new ArcoLongo());
                        } else {
                            arqueiro = new Arqueiro(nomePersonagem, new Balestra());
                        } // Fim if/else selecionaArma
                        personagens.add(arqueiro);
                        System.out.println(arqueiro);
                    } // fim if/else menuSelecaoDeClasse

                    String criarOutroPersonagem = menu.repeteCriacaoPersonagem();
                    if(criarOutroPersonagem.equals("S") || criarOutroPersonagem.equals("s")) {
                        continue;
                    } else {
                        break;
                    } // fim if/else

                } else {
                    System.out.println("Jogo Finalizado...");
                } // fim if/else menuSecundario
            } else {
                System.out.println("Jogo Finalizado...");
            } // fim if/else menuInicial
        }

        if(personagens.size() > 0) {
            interfaceJogo.mensagemInicial();

            float defesaInicial = 0;
            for (Personagem personagem : personagens) {
                defesaInicial = personagem.pontosDeDefesa;
            } // Fim forEach
        
            while(dragao.pontosDeVida > 0 && personagens.size() > 0) {
                interfaceJogo.contadorDeTurno();
                for (Personagem personagem : personagens) {
                    System.out.printf("\nPersonagem Selecionado: %s\n", personagem.nomePersonagem);
                    int opcaoTurno = interfaceJogo.turnoPersonagem();
    
                    if(opcaoTurno == 1) {
                        personagem.atacar(personagem, dragao);
                        if(dragao.pontosDeVida <= 0) {
                            System.out.println("Você derrotou LazyProg, agora o mundo pode viver em paz novamente!");
                        }
                    } else {
                        personagem.defender();
                    } // Fim if/else
                } // Fim forEach

                // Seleciona o alvo do dragão aleatoriamente
                dragao.atacar(dragao, personagens.get(dragao.alvoDragao(personagens)));

                // // Verifica a vida dos personagens
                for(int i = 0; i < personagens.size(); i++) {
                    if(personagens.get(i).pontosDeVida <= 0) {
                        System.out.printf("O personagem %s morreu", personagens.get(i).nomePersonagem);
                        personagens.remove(i);
                    }
                } // Fim forEach

                // Remove o bônus de defesa caso necessário
                for (Personagem personagem : personagens) {
                    if(personagem.pontosDeDefesa > defesaInicial) {
                        personagem.pontosDeDefesa -= (defesaInicial * 0.1);
                    }
                } // Fim forEach

                if(personagens.size() == 0) {
                    System.out.println("Você não derrotou LazyProg, tente novamente em sua reencarnação!");
                }
            } // fim while jogo
        } // fim if jogo
    } // fim método main
} // fim classe RPG
