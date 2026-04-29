//Atividade 2 – Classe Calculadora com Métodos
//Atividade:
//Crie uma classe chamada Calculadora com os seguintes métodos:
//● somar(int a, int b)
//● subtrair(int a, int b)
//● multiplicar(int a, int b)
//● dividir(int a, int b)
//Cada metodo deve retornar o resultado da operação.
//Crie uma classe principal para testar pelo menos duas operações.
//Desafio opcional:
//Evitar divisão por zero.

package Atividade2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        // Imports

        Calculadora cl = new Calculadora();
        Scanner sc = new Scanner(System.in);

        // Variaveis

        int opcao;

        do {

            System.out.print("Insira o primeiro número: ");
            cl.setA(sc.nextInt());

            System.out.print("Insira o segundo número: ");
            cl.setB(sc.nextInt());

            System.out.println("Insira qual operação realizar: ");
            System.out.println();

            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            if (opcao == 1) {

                cl.somar(cl);

            } else if (opcao == 2) {

                cl.subtrair(cl);

            } else if (opcao == 3) {

                cl.multiplicar(cl);

            } else if (opcao == 4) {

                cl.dividir(cl);

            } else {
                System.out.println("Obrigado por acessar o programa! Ass: Bruno Jesus 972611032");
            }

        }
        while (opcao != 0);
    }
}