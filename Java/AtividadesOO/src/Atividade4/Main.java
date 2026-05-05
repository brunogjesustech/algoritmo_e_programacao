//Atividade 4 – Classe Produto
//Atividade:
//Crie uma classe Produto com os atributos:
//● nome
//● preco
//● quantidade
//Crie os métodos:
//● calcularValorTotal() → retorna preco * quantidade
//● exibirProduto() → mostra todas as informações do produto
//Crie dois produtos diferentes e exiba o valor total de cada um.
//Conceitos trabalhados:
//● Métodos com retorno
//● Lógica dentro da classe
//● Organização do código

package Atividade4;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        int opcao;

        Scanner sc = new Scanner(System.in);
        Produto prod = new Produto();

        // Criar dois produtos

        System.out.print("Digite o nome do produto: ");
        prod.setNome(sc.next());

        System.out.print("Digite o valor do produto: ");
        prod.setPreco(sc.nextDouble());

        System.out.print("Digite o quantidade do produto: ");
        prod.setQuantidade(sc.nextInt());

        do {
            System.out.println();
            System.out.println("Menu de escolha");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Calcular valor total");
            System.out.println("2 - Mostrar Informações");
            System.out.println("0 - Sair");
            System.out.println();
            opcao = sc.nextInt();


            if (opcao == 1) {
                System.out.println("Valor total: R$ " + prod.calcularValorTotal());
            }
            if (opcao == 2) {

                prod.exibirProduto();

            }
            if (opcao == 0) {
                System.out.println("Encerrando programa, obrigado por acessar. Ass: Bruno Jesus 972611032");
                System.exit(0);
            }

        } while (opcao != 0);

    }
}
