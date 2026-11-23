import java.util.Scanner;
import java.util.Locale;

public class CondicoesSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite o valor que deseja sacar: ");

        double saldo = 25.0;
        double valorSolicitado = scanner.nextDouble();

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        else System.out.println("Saldo insuficiente na conta");
        System.out.println(saldo);


    }


}
