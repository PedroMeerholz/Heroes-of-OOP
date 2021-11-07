import java.util.Scanner;

public class InterfaceJogo {
    private String borda = "-";
    private int turno = 0; 

    public  void mensagemInicial() {
        System.out.println("\n" + this.borda.repeat(62));
        System.out.println("\nHeroes of OOP\n\n");
        System.out.println("Você encontrou com o dragão LazyProg, derrote-o para vencer o jogo!\n");
    } // fim método mensagemInicial

    public void contadorDeTurno() {
        turno += 1;
        System.out.printf("\n%d° Turno\n\n", this.turno);
    } // fim método contadorDeTurno

    public int turnoPersonagem() {
        System.out.println("\nN° SELEÇÃO\tAÇÃO");
        System.out.println("1\t\tAtacar");
        System.out.println("2\t\tDefender");
        System.out.print("N° Seleção: ");

        Scanner scnOpcao = new Scanner(System.in);

        int opcao = scnOpcao.nextInt();
        
        if(opcao != 1 && opcao != 2){
            boolean condicao = false;

            while(condicao == false) {
                System.out.println("[ERRO]OPÇÃO NÃO RECONHECIDA");
                System.out.print("\nN° Selecao: ");
                opcao = scnOpcao.nextInt();

                if(opcao == 1 || opcao == 2){
                    condicao = true;
                    return opcao;
                }
            } // fim while
        } else {
            return opcao;
        } // fim if/else

        return opcao;
    } // fim método turnoPersonagem
} // fim método main
