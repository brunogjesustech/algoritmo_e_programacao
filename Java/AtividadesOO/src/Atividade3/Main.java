package Atividade3;

import java.util.Scanner;

public class Main{
    static void main(String[] args) {

        // Imports

        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        // Variaveis

        int opcao;

        // Do

        do {
            System.out.println();
            System.out.println("Menu Bancário");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Mostrar Saldo");
            System.out.println("0 - Sair");
            System.out.println();

            opcao = sc.nextInt();

            if (opcao == 1) {

                System.out.print("Insira o valor que deseja depositar: R$ ");
                conta.depositar(sc.nextDouble());
            }
            if (opcao == 2) {

                System.out.print("Insira o valor que deseja sacar: R$ ");
                conta.sacar(sc.nextDouble());

            }
            if (opcao == 3) {

                conta.mostrarSaldo();

            }
            if (opcao == 0) {
                System.out.println("Encerrando o programa, obrigado por acessar ass: Bruno Gonçalves RA: 972611032");
            }


        }while (opcao != 0);


    }
}
