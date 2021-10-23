import java.util.Scanner;

public class SelecaoArmaMago {
    public static void main(String[] args) {
        String borda = "-";
        System.out.println("\n" + borda.repeat(62));
        System.out.println("\nHeroes Of OOP\n\n");
        System.out.println("Menu de Criação de Personagem\n");
        System.out.println("Arma do Personagem:");
        System.out.println("N° SELEÇÃO\tNOME ARMA\tADICIONAL ATAQUE\tADICIONAL DEFESA");
        System.out.println("1\t\tVarinha\t\t+16\t\t\t+9");
        System.out.println("2\t\tCajado\t\t+13\t\t\t+12");
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
                        Mago personagemMago = new Mago(nomePersonagem, new Varinha());
                    } else if(armaPersonagem == 2){
                        System.out.print("\n\nNome Do Personagem: ");
                        String nomePersonagem = scnNomePersonagem.nextLine();
                        Mago personagemMago = new Mago(nomePersonagem, new Cajado());
                    }
                }
            }
        } else if(armaPersonagem == 1){
            System.out.print("\n\nNome Do Personagem: ");
            String nomePersonagem = scnNomePersonagem.nextLine();
            Mago personagemMago = new Mago(nomePersonagem, new Varinha());
        } else if(armaPersonagem == 2){
            System.out.print("\n\nNome Do Personagem: ");
            String nomePersonagem = scnNomePersonagem.nextLine();
            Mago personagemMago = new Mago(nomePersonagem, new Cajado());
        }
    }
}
