import java.util.Scanner;

public class Menu {

    private String borda = "-";

    public int menuInicial() {
        System.out.println("Heroes of OOP\n\n");
        System.out.println("Menu Inicial\n");
        System.out.println("N° SELEÇÃO\tOPÇÃO");
        System.out.println("1\t\tIniciar Partida");
        System.out.println("2\t\tSair do Jogo");
        System.out.print("\nN° Selecao: ");
    
        int opcaoInicial = selecionaOpcaoMenu();
    
        if(opcaoInicial < 1 || opcaoInicial > 2) {
            System.out.println("[ERRO]OPÇÃO NÃO RECONHECIDA");
            boolean condicao = false;
            while(condicao == false) {
                System.out.print("\nN° Selecao: ");
                opcaoInicial = selecionaOpcaoMenu();
                if(opcaoInicial == 1 || opcaoInicial == 2) {
                    condicao = true;
                    if(opcaoInicial == 1){
                        return 1;
                    } else {
                        return 2;
                    }
                }
            }
        } else if(opcaoInicial == 1) {
            return 1;
        } else if(opcaoInicial == 2) {
            return 2;
        }

        return 0;
    }

    public int menuSecundario() {
        System.out.println("\n" + this.borda.repeat(62));
        System.out.println("\nHeroes Of OOP\n\n");
        System.out.println("Menu Secundário\n");
        System.out.println("N° SELEÇÃO\tOPÇÃO");
        System.out.println("1\t\tCriar Personagem");
        System.out.println("2\t\tSair do Jogo");
        System.out.print("\nN° Selecao: ");

        int opcaoSecundaria = selecionaOpcaoMenu();

        if(opcaoSecundaria < 1 || opcaoSecundaria > 2) {
            System.out.println("[ERRO]OPÇÃO NÃO RECONHECIDA");
            boolean condicao = false;
            while(condicao == false) {
                System.out.print("\nN° Selecao: ");
                opcaoSecundaria = selecionaOpcaoMenu();
                if(opcaoSecundaria == 1 || opcaoSecundaria == 2) {
                    condicao = true;
                    if(opcaoSecundaria == 1) {
                        return 1;
                    } else {
                        return 2;
                    }
                }
            }
        } else if(opcaoSecundaria == 1) {
            return 1;
        } else if(opcaoSecundaria == 2) {
            return 2;
        }
        return 0;
    }

    public int menuSelecaoDeClasse() {
        System.out.println("\n" + this.borda.repeat(62));
        System.out.println("\nHeroes Of OOP\n");
        System.out.println("Menu de Criação de Personagem\n");
        System.out.println("Classe do Personagem:");
        System.out.println("N° SELEÇÃO\tCLASSE PERSONAGEM");
        System.out.println("1\t\tGuerreiro");
        System.out.println("2\t\tMago");
        System.out.println("3\t\tArqueiro");
        System.out.print("\nN° Selecao: ");

        int classePersonagem = selecionaOpcaoMenu();
        
        if(classePersonagem < 1 || classePersonagem > 3){
            System.out.println("[ERRO]OPÇÃO NÃO RECONHECIDA");
            boolean condicao = false;
            while(condicao == false) {
                System.out.print("\nN° Selecao: ");
                classePersonagem = selecionaOpcaoMenu();
                if(classePersonagem == 1 || classePersonagem == 2 || classePersonagem == 3){
                    condicao = true;
                    if(classePersonagem == 1){
                        return 1;
                    } else if(classePersonagem == 2){
                        return 2;
                    } else if(classePersonagem == 3) {
                        return 3;
                    }
                }
            }
        } else if(classePersonagem == 1) {
            return 1;
        } else if(classePersonagem == 2) {
            return 2;
        } else if(classePersonagem == 3) {
            return 3;
        }
        
        return 0;
    }

    public int menuSelecionaArmaGuerreiro() {
            System.out.println("\n" + this.borda.repeat(62));
            System.out.println("\nHeroes Of OOP\n\n");
            System.out.println("Menu de Criação de Personagem\n");
            System.out.println("Arma do Personagem:");
            System.out.println("N° SELEÇÃO\tNOME ARMA\tADICIONAL ATAQUE\tADICIONAL DEFESA");
            System.out.println("1\t\tEspada\t\t+10\t\t\t+15");
            System.out.println("2\t\tMachado\t\t+17\t\t\t+8");
            System.out.print("\nN° Selecao: ");
    
            int armaPersonagem = selecionaAmaPersonagem();
    
            if(armaPersonagem < 1 || armaPersonagem > 2){
                boolean condicao = false;
    
                while(condicao == false) {
                    System.out.println("[ERRO]OPÇÃO NÃO RECONHECIDA");
                    System.out.print("\nN° Selecao: ");
                    armaPersonagem = selecionaAmaPersonagem();
    
                    if(armaPersonagem == 1 || armaPersonagem == 2){
                        condicao = true;
    
                        if(armaPersonagem == 1){
                            return 1;
                        } else if(armaPersonagem == 2){
                            return 2;
                        }
                    }
                }
            } else {  
                if(armaPersonagem == 1){
                    return 1;
                } else if(armaPersonagem == 2){
                    return 2;
                }
            }
        
        return 0;
    }

    public int menuSelecionaArmaArqueiro() {
        System.out.println("\n" + this.borda.repeat(62));
        System.out.println("\nHeroes Of OOP\n\n");
        System.out.println("Menu de Criação de Personagem\n");
        System.out.println("Arma do Personagem:");
        System.out.println("N° SELEÇÃO\tNOME ARMA\tADICIONAL ATAQUE\tADICIONAL DEFESA");
        System.out.println("1\t\tArco Longo\t\t+12\t\t\t+13");
        System.out.println("2\t\tBalestra\t\t+15\t\t\t+10");
        System.out.print("\nN° Selecao: ");

        int armaPersonagem = selecionaAmaPersonagem();

        if(armaPersonagem < 1 || armaPersonagem > 2){
            boolean condicao = false;

            while(condicao == false) {
                System.out.println("[ERRO]OPÇÃO NÃO RECONHECIDA");
                System.out.print("\nN° Selecao: ");
                armaPersonagem = selecionaAmaPersonagem();

                if(armaPersonagem == 1 || armaPersonagem == 2){
                    condicao = true;
                    if(armaPersonagem == 1){
                        return 1;
                    } else if(armaPersonagem == 2){
                        return 2;
                    }
                }
            }
        } else {
            if(armaPersonagem == 1){
                return 1;
            } else if(armaPersonagem == 2){
                return 2;
            }
        }

        return 0;
    }

    public int menuSelecionaArmaMago() {
        System.out.println("\n" + this.borda.repeat(62));
        System.out.println("\nHeroes Of OOP\n\n");
        System.out.println("Menu de Criação de Personagem\n");
        System.out.println("Arma do Personagem:");
        System.out.println("N° SELEÇÃO\tNOME ARMA\tADICIONAL ATAQUE\tADICIONAL DEFESA");
        System.out.println("1\t\tVarinha\t\t+16\t\t\t+9");
        System.out.println("2\t\tCajado\t\t+13\t\t\t+12");
        System.out.print("\nN° Selecao: ");

        int armaPersonagem = selecionaAmaPersonagem();
        
        if(armaPersonagem < 1 || armaPersonagem > 2){
            boolean condicao = false;

            while(condicao == false) {
                System.out.println("[ERRO]OPÇÃO NÃO RECONHECIDA");
                System.out.print("\nN° Selecao: ");
                armaPersonagem = selecionaAmaPersonagem();

                if(armaPersonagem == 1 || armaPersonagem == 2){
                    condicao = true;
                    if(armaPersonagem == 1){
                        return 1;
                    } else if(armaPersonagem == 2){
                        return 2;
                    }
                }
            }
        } else {
            if(armaPersonagem == 1){
                return 1;
            } else if(armaPersonagem == 2){
                return 2;
            }
        }

        return 0;
    }

    public int selecionaOpcaoMenu() {
        Scanner scnOpcaoMenu = new Scanner(System.in);
        int opcao = scnOpcaoMenu.nextInt();

        return opcao;
    }
    
    public String selecionaNomePersonagem() {
        Scanner scnNomePersonagem = new Scanner(System.in);
        System.out.print("\n\nNome Do Personagem: ");
        String nomePersonagem = scnNomePersonagem.nextLine();

        return nomePersonagem;
    }

    public int selecionaAmaPersonagem() {
        Scanner scnArmaPersonagem = new Scanner(System.in);
        int armaPersonagem = scnArmaPersonagem.nextInt();

        return armaPersonagem;
    }
}
 