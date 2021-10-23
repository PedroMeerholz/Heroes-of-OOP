import java.util.Scanner;

public class SelecaoArmaArqueiro {
    public static void main(String[] args) {
        String borda = "-";
        System.out.println("\n" + borda.repeat(62));
        System.out.println("\nHeroes Of OOP\n\n");
        System.out.println("Menu de Criação de Personagem\n");
        System.out.println("Arma do Personagem:");
        System.out.println("N° SELEÇÃO\tNOME ARMA\tADICIONAL ATAQUE\tADICIONAL DEFESA");
        System.out.println("1\t\tArco Longo\t\t+12\t\t\t+13");
        System.out.println("2\t\tBalestra\t\t+15\t\t\t+10");
        System.out.print("\nN° Selecao: ");

        Scanner scnArmaPersonagem = new Scanner(System.in);
        int armaPersonagem = scnArmaPersonagem.nextInt();

        Scanner scnNomePersonagem = new Scanner(System.in);

        if(armaPersonagem < 1 || armaPersonagem > 2){
            boolean condicao = false;
            while(condicao == false) {
                System.out.println("[ERRO]OPÇÃO NÃO RECONHECIDA");
                System.out.print("\nN° Selecao: ");
                armaPersonagem = scnArmaPersonagem.nextInt();
                if(armaPersonagem == 1 || armaPersonagem == 2){
                    condicao = true;
                    if(armaPersonagem == 1){
                        System.out.print("\n\nNome Do Personagem: ");
                        String nomePersonagem = scnNomePersonagem.nextLine();
                        Arqueiro personagemArqueiro = new Arqueiro(nomePersonagem, new ArcoLongo());
                    } else if(armaPersonagem == 2){
                        System.out.print("\n\nNome Do Personagem: ");
                        String nomePersonagem = scnNomePersonagem.nextLine();
                        Arqueiro personagemArqueiro = new Arqueiro(nomePersonagem, new Balestra());
                    }
                }
            }
        } else if(armaPersonagem == 1){
            System.out.print("\n\nNome Do Personagem: ");
            String nomePersonagem = scnNomePersonagem.nextLine();
            Arqueiro personagemArqueiro = new Arqueiro(nomePersonagem, new ArcoLongo());
        } else if(armaPersonagem == 2){
            System.out.print("\n\nNome Do Personagem: ");
            String nomePersonagem = scnNomePersonagem.nextLine();
            Arqueiro personagemArqueiro = new Arqueiro(nomePersonagem, new Balestra());
        }
    }
}
