import java.util.Scanner;

public class Rpg{
    public static void main(String[] args){
        while(true){
            System.out.println("\t\t\t\t\tHeroes of POO\n\n");
            System.out.println("\t\t\t\t\tMenu Inicial\n");
            System.out.println("\t\t\t  1 - Iniciar Partida\t  2 - Sair do jogo");
            System.out.print("\n\t\t\t\t\tDigite Aqui: ");

            Scanner selecionaOpcaoInicial = new Scanner(System.in);
            int opcaoInicial = selecionaOpcaoInicial.nextInt();

            if(opcaoInicial < 1 || opcaoInicial > 2){
                System.out.println("\n\t\t\t\t    Opção não reconhecida");
                System.out.println("\n\t\t--------------------------------------------------------------");
            } else if(opcaoInicial == 1){
                System.out.println("\n\t\t--------------------------------------------------------------");
                System.out.println("\n\n\t\t\t\t\tHeroes Of POO\n\n");
                System.out.println("\t\t\t\t\tMenu Inicial\n");
                System.out.println("\t\t\t  1 - Criar Personagem\t  2 - Sair do Jogo");
                System.out.print("\n\t\t\t\t\tDigite Aqui: ");

                Scanner selecionaOpcaoSecundaria = new Scanner(System.in);
                int opcaoSecundaria = selecionaOpcaoInicial.nextInt();

                if(opcaoSecundaria < 1 || opcaoSecundaria > 2){
                    System.out.println("\n\t\t\t\t    Opção não reconhecida");
                    System.out.println("\n\t\t--------------------------------------------------------------");
                } else if(opcaoSecundaria == 1){
                    
                } else if(opcaoSecundaria == 2){
                    System.out.println("\n\t\t\t\t       Jogo Finalizado!");
                    return;
                }
            } else if(opcaoInicial == 2){
                System.out.println("\n\t\t\t\t       Jogo Finalizado!");
                return;
            }
        }
    }
}