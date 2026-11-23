import java.util.Scanner;
import java.util.Locale;

public class CondicaoTernaria {

    static void main() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("nota do aluno");
        double nota  = scanner.nextDouble();

        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);


        System.out.println("nota do aluno novo: ");
        double notaNova  = scanner.nextDouble();

        String resultadoNovo = notaNova >=7 ? "Aprovado" : notaNova >=5 && notaNova <7 ? "Recuperação": "Reprovado";
        System.out.println(resultadoNovo);


    }
}
