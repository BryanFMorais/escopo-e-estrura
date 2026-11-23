import java.util.Scanner;
import java.util.Locale;

public class CondicoesEncadeadas {

   public static void main() {

       System.out.println("Digite a nota do aluno");

       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       double nota = scanner.nextDouble();

       if(nota >= 6)
           System.out.println("Passou");

       else if (nota >= 4 && nota < 6) //vai me retornar ou T o F
           System.out.println("Recuperação");

       else System.out.println("Reprovado");




   }
}
