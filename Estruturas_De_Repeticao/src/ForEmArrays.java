import java.util.Scanner;
import java.util.Locale;

public class ForEmArrays {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String alunos[] = {"Felipe","Jonas", "julia", "marcos"};

        for (int x=0; x < alunos.length; x++){
            System.out.println("o aluno no indice x= " + x + " é " + alunos[x]);
        }


        //teste de como implementar no codigo de certa forma
        System.out.println("digite o numero do aluno que vc deseja saber: ");
        int escolha = scanner.nextInt();

        System.out.println(alunos[escolha]);


        //forEach
        String alunosNovos [] = {"Felipe","Jonas", "julia", "marcos"};

        //forma abreviada

        //os dois pontos serve para dizer que a cada iteração de alunos o aluno atual vai atualizar automaticamente essa variavel
        for (String alunoNovo: alunosNovos){
            System.out.println("Nome do aluno é " + alunoNovo);
        }


    }
}
