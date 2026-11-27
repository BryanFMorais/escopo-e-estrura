import java.util.Scanner;

public class Controle_De_fluxo_desafio {
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        int numeros = 0;

        System.out.println("primeiro parametro");
        int parametro1 = scanner.nextInt();
        System.out.println("segundo paramentro");
        int parametro2 = scanner.nextInt();
        scanner.close();

        int parametroDuplo = parametro1 - parametro2;
        try {
            error(parametro1, parametro2);
        }catch (ParametrosInvalidosException exception){
            System.out.println("o parametro 2 deve ser maior que o parametro 1");
        }
        for (int calculo = 0; calculo < parametroDuplo; calculo++) {
            System.out.println(numeros);
            numeros++;
        }
    }


    static void error(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if (parametro1 > parametro2){
            throw  new ParametrosInvalidosException();
        }

    }


}