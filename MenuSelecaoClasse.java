import java.util.Scanner;

public class MenuSelecaoClasse {
    public static void main(String[] args) {
        String borda = "-";
        System.out.println("\n" + borda.repeat(62));
        System.out.println("\n\nHeroes Of OOP\n");
        System.out.println("Menu de Criação de Personagem\n");
        System.out.println("Classe do Personagem:");
        System.out.println("N° SELEÇÃO\tCLASSE PERSONAGEM");
        System.out.println("1\t\tGuerreiro");
        System.out.println("2\t\tMago");
        System.out.println("3\t\tArqueiro");
        System.out.print("\nN° Selecao: ");

        Scanner scnClassePersonagem = new Scanner(System.in);
        int classePersonagem = scnClassePersonagem.nextInt();
        
        if(classePersonagem < 1 || classePersonagem > 3){
            System.out.println("[ERRO]OPÇÃO NÃO RECONHECIDA");
            boolean condicao = false;
            while(condicao == false) {
                System.out.print("\nN° Selecao: ");
                classePersonagem = scnClassePersonagem.nextInt();
                if(classePersonagem == 1 || classePersonagem == 2){
                    condicao = true;
                    if(classePersonagem == 1){
                        SelecaoArmaGuerreiro.main(args);
                    } else if(classePersonagem == 2){
                        SelecaoArmaMago.main(args);
                    } else if(classePersonagem == 3) {
                        SelecaoArmaArqueiro.main(args);
                    }
                }
            }
        } else if(classePersonagem == 1) {
            SelecaoArmaGuerreiro.main(args);
        } else if(classePersonagem == 2) {
            SelecaoArmaMago.main(args);
        } else if(classePersonagem == 3) {
            SelecaoArmaArqueiro.main(args);
        }
    }
}