import java.util.Scanner;

public class MenuInicial {
    public static void main(String[] args) {
        System.out.println("Heroes of OOP\n\n");
        System.out.println("Menu Inicial\n");
        System.out.println("N° SELEÇÃO\tOPÇÃO");
        System.out.println("1\t\tIniciar Partida");
        System.out.println("2\t\tSair do Jogo");
        System.out.print("\nN° Selecao: ");

        Scanner selecaoMenuInicial = new Scanner(System.in);
        int opcaoInicial = selecaoMenuInicial.nextInt();

        if(opcaoInicial < 1 || opcaoInicial > 2){
            System.out.println("[ERRO]OPÇÃO NÃO RECONHECIDA");
            boolean condicao = false;
            while(condicao == false) {
                System.out.print("\nN° Selecao: ");
                opcaoInicial = selecaoMenuInicial.nextInt();
                if(opcaoInicial == 1 || opcaoInicial == 2){
                    condicao = true;
                    if(opcaoInicial == 1){
                        MenuSecundario.main(args);
                    } else {
                        System.out.println("\nJogo Finalizado!");
                    }
                }
            }
        } else if(opcaoInicial == 1){
            MenuSecundario.main(args);
        } else if(opcaoInicial == 2) {
            System.out.println("\nJogo Finalizado!");
        }
    }
}
