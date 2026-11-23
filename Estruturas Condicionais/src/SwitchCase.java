import java.util.Scanner;
import java.util.Locale;

public class SwitchCase {

    static void main() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Modo condicional if/els
         /*o equals foi colocado por mim pois o metodo de usar o == da erro utilizando o scanner
         por causa de uma tal de pool do java o ignorecase e para aceitar tanto maiuscula quanto minuscula

         */

        System.out.println("scanner if/else");

        System.out.println("Digite o seu tamanho: G, M, P");
        String sigla = scanner.next();

        if (sigla.equalsIgnoreCase("G"))
            System.out.println("Grande");

        else if (sigla.equalsIgnoreCase("M"))
            System.out.println("Medio");

        else if (sigla.equalsIgnoreCase("P") )
            System.out.println("Pequeno");

        else System.out.println("Digite O tamanho correto ou não temos em estoque");

        //Modo condicional switch / case

        System.out.println("Scanner switch(case)");
        System.out.println("Digite o tamnanho da outra pessoa");
        String siglaNova = scanner.next();

        switch(siglaNova) {
            case "P", "p" :{
                System.out.println("pequeno");
                break;
            }
            case "M", "m" :{
                System.out.println("medio");
                break;
            }
            case "G", "g" :{
                System.out.println("grande");
                break;
            }
            default:
                System.out.println("Fora de estoque ou tamanho errado");
        }



        //exemplo de caso bom para mostrar o switch/case

        /*
        o sistema tera 03 planos: basis, media e turbo
        basic: 100 minutos de ligação
        meida: 100 minutos de ligação + whats e insta gratis
        turbo: 100 minutos de ligação + whats e isnta gratis + 5gb de yt
         */

        // no modo if/else fica enorme
        System.out.println("metodo if/else");
        String plano = "M"; //M / T
        System.out.println("esolcha o seu plano");

        if(plano == "B"){
            System.out.println("100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("whats e instagram Gratis");
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("whats e instagram Gratis");
            System.out.println("5gb Youtube");
        }


        /*na forma de switch
        nesta forma e mais facil de entender e n repete coisas desnecessarias
         */


        System.out.println("agora o metodo swithc");
        String planoCase = "B";//M / T
        switch (planoCase){
            case "T","t" :{
                System.out.println("5gb de YT");
            }
            case "M","m":{
                System.out.println("Whats e insta gratis");
            }
            case "B","b":{
                System.out.println("100 minutos de ligação");
            }
        }

    }
}
