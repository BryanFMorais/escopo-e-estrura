import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class TryCatch {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {

        System.out.println("digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("digite seu peso");
        double peso = scanner.nextDouble();


            scanner.close();
            System.out.println("ola, me chamo " + nome + " tenho "+idade+ " de idade. Tenho "+ altura+" de altura e peso "+ peso + "KG" );

        }
        catch (InputMismatchException e){
            System.err.println("os campos idade e altura devem ser preenchidos com numeros");
        }













       }

    }
