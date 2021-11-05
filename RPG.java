public class RPG {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int menuInicial = menu.menuInicial();
        int menuSecundario;
        int menuSelecaoDeClasse;
        int menuSelecionaArma;
        Personagem guerreiro;
        Personagem mago;
        Personagem arqueiro;
        int numeroDePersonagens;

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
                    }
                    System.out.println(guerreiro);
                } else if(menuSelecaoDeClasse == 2) {
                    menuSelecionaArma = menu.menuSelecionaArmaMago();

                    if(menuSelecionaArma == 1) {
                        mago = new Mago(nomePersonagem, new Varinha());
                    } else {
                        mago = new Mago(nomePersonagem, new Cajado());
                    }
                    System.out.println(mago);
                } else {
                    menuSelecionaArma = menu.menuSelecionaArmaArqueiro();

                    if(menuSelecionaArma == 1) {
                        arqueiro = new Arqueiro(nomePersonagem, new ArcoLongo());
                    } else {
                        arqueiro = new Arqueiro(nomePersonagem, new Balestra());
                    }
                    System.out.println(arqueiro);
                } // fim if/else menuSelecaoDeClasse
            } else {
                System.out.println("Jogo Finalizado...");
            } // fim if/else menuSecundario
        } else {
            System.out.println("Jogo Finalizado...");
        } // fim if/else menuInicial
    } // fim método main
} // fim classe RPG
