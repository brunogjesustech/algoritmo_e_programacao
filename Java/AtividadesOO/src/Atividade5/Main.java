package Atividade5;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        int opcao;

        Scanner sc = new Scanner(System.in);
        Aluno al = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        al.setNome(sc.next());

        System.out.print("Digite a primeira nota do aluno: ");
        al.setNota1(sc.nextDouble());

        System.out.print("Digite a segunda nota do aluno: ");
        al.setNota2(sc.nextDouble());


        do {
            System.out.println();
            System.out.println("Menu de Escolha");
            System.out.println("Escolha uma Opção:");
            System.out.println("1 - Calcular Média");
            System.out.println("2 - Situação");
            System.out.println("0 - Sair");
            System.out.println();
            opcao = sc.nextInt();

            if (opcao == 1) {

                System.out.println("Sua média foi: " + al.calcularMedia());

            }
            if (opcao == 2) {

                al.verificarSituacao();

            }

            if (opcao == 0) {
                System.out.println("Encerrando programa, obrigado por acessar. Ass: Bruno Jesus 972611032");
                System.exit(0);
            }

        } while (opcao != 0);

    }
}
