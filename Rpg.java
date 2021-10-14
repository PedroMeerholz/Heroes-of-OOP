import java.util.Scanner;

public class Rpg{
    public static void main(String[] args){
        System.out.println("\t\t\t\t\tHeroes of POO\n\n");
        System.out.println("\t\t\t\t\tMenu Inicial\n");
        System.out.println("\t\t\t  1 - Iniciar Partida\t  2 - Sair do jogo\n");

        System.out.print("\t\t\t\t\tDigite Aqui: ");
        Scanner selecionaOpcaoInicial = new Scanner(System.in);
        int opcaoInicial = selecionaOpcaoInicial.nextInt();
    }
}