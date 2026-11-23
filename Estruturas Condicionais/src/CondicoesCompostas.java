import java.util.Scanner;
import java.util.Locale;

public class CondicoesCompostas {

  public static void main() {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      System.out.println("Digite a nota do aluno: ");
      double nota = scanner.nextDouble();



      if (nota >= 7)
          System.out.println("você passou");
      else
          System.out.println("Reprovado");

  }
}
