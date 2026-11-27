import java.util.Scanner;

 class Contador {
    static void main() {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {

            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("o segundo parametro e deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int calculo = 0; calculo < contagem; calculo++) {
            System.out.println(calculo);
        }

    }
}