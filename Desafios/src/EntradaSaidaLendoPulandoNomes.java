import java.util.Scanner;
import java.lang.String;

public class EntradaSaidaLendoPulandoNomes {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      String[] nomes = new String[10];

      for (int i = 0; i < 10; i++ ){
          nomes[i] = scanner.nextLine();
      }
      int escolha1 = 2;
       int escolha2 = 7;
       int escolha3 = 8;
       System.out.println(nomes[escolha1]);
       System.out.println(nomes[escolha2]);
       System.out.println(nomes[escolha3]);
    }


}
