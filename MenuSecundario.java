import java.util.Scanner;

public class MenuSecundario {
    public static void main(String[] args) {
        String borda = "-";
        System.out.println("\n" + borda.repeat(62));
        System.out.println("\nHeroes Of OOP\n\n");
        System.out.println("Menu Secundário\n");
        System.out.println("N° SELEÇÃO\tOPÇÃO");
        System.out.println("1\t\tCriar Personagem");
        System.out.println("2\t\tSair do Jogo");
        System.out.print("\nN° Selecao: ");

        Scanner selecaoMenuSecundario = new Scanner(System.in);
        int opcaoSecundaria = selecaoMenuSecundario.nextInt();

        if(opcaoSecundaria < 1 || opcaoSecundaria > 2){
            System.out.println("[ERRO]OPÇÃO NÃO RECONHECIDA");
            boolean condicao = false;
            while(condicao == false) {
                System.out.print("\nN° Selecao: ");
                opcaoSecundaria = selecaoMenuSecundario.nextInt();
                if(opcaoSecundaria == 1 || opcaoSecundaria == 2){
                    condicao = true;
                    if(opcaoSecundaria == 1){
                        
                    } else {
                        System.out.println("\nJogo Finalizado!");
                    }
                }
            }
        } else if(opcaoSecundaria == 1){
            MenuSelecaoClasse.main(args);
        } else if(opcaoSecundaria == 2) {
            System.out.println("\nJogo Finalizado!");
        }
    }
}
