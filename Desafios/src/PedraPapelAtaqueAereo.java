import java.util.Scanner;
public class PedraPapelAtaqueAereo {

   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String jogador1, jogador2;

        //System.out.println("Bem vindo ao jogo Pedra, Papel e Ataque.");
        //ystem.out.println("jogador 1. Faça seu ataque: ")
       for(int i = 0; i < N; i++) {
           jogador1 = scanner.next();

           //System.out.println("Jogador 2. Faça seu ataque: ");
           jogador2 = scanner.next();


           if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel"))
               System.out.println("Ambos venceram");
           else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra")) {
               System.out.println("Sem ganhador");
           } else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel")) {
               System.out.println("Jogador 1 venceu");
           } else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("pedra")) {
               System.out.println("Jogador 2 venceu");
           } else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) {
               System.out.println("Aniquilacao mutua");
           } else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel")) {
               System.out.println("Jogador 1 venceu");
           } else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("ataque")) {
               System.out.println("Jogador 2 venceu");
           } else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra")) {
               System.out.println("Jogador 1 venceu");
           } else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("ataque")) {
               System.out.println("Jogador 2 venceu");
           } else System.out.println("Sem ganhador");
       }
       scanner.close();

    }

}
