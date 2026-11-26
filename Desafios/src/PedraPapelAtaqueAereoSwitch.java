import java.util.Scanner;
public class PedraPapelAtaqueAereoSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        //String jogador1 = "";
        //String jogador2 = "";
        //System.out.println("Bem vindo ao jogo Pedra, Papel e Ataque.");
        //ystem.out.println("jogador 1. Faça seu ataque: ")

        String jogador1,jogador2;

        for (int i = 0; i < N; i++) {
            jogador1 = scanner.next();
            jogador2 = scanner.next();
            String jogada = jogador1.toLowerCase() + jogador2.toLowerCase();

            switch (jogada) {
                case "pedra" + "pedra": {
                    System.out.println("Sem ganhador");
                    break;
                }
                case "papel" + "papel": {
                    System.out.println("Ambos venceram");
                    break;
                }
                case "ataque"+"ataque":{
                    System.out.println("Aniquilacao mutua");
                    break;
                }
                case "pedra"+"papel":{
                    System.out.println("Jogador 1 venceu");
                    break;
                }
                case "papel" + "pedra":{
                    System.out.println("Jogador 2 venceu");
                    break;
                }
                case "ataque"+"pedra":{
                    System.out.println("Jogador 1 venceu");
                    break;
                }
                case "ataque" + "papel":{
                    System.out.println("Jogador 1 venceu");
                    break;
                }
                case "pedra"+"ataque":{
                    System.out.println("Jogador 2 venceu");
                    break;
                }
                case "papel" + "ataque":{
                    System.out.println("Jogador 2 venceu");
                    break;
                }
                default:{
                    System.out.println("digite corretamente");
                }




            }
        }

    }
}
