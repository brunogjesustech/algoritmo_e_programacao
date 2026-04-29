//Atividade:
//Crie uma classe chamada Pessoa que possua os seguintes atributos:
// nome (String)
// idade (int)
//E os seguintes métodos:
// apresentar() → imprime o nome e a idade da pessoa.
// fazerAniversario() → aumenta a idade em 1 ano.
//Crie uma classe Main para criar um objeto Pessoa e testar os métodos.

package Atividade1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        // Variáveis

        boolean validador = true;
        String continua;

        // Imports

        Scanner sc = new Scanner(System.in);
        Pessoa ps = new Pessoa();

        // Código

        System.out.print("Insira seu nome: ");
        ps.setNome(sc.next());

        System.out.print("Insira sua idade: ");
        ps.setIdade(sc.nextInt());

        // Aniversário

        System.out.println("Deseja fazer aniversário? S ou N: ");
        continua = sc.next().toUpperCase();

        if (continua.equals("S")) {
            validador = true;
            ps.fazerAniversario(ps);
            ps.apresentar(ps);
            System.out.println("Encerrando o programa...");
            System.exit(0);
        }
        if (continua.equals("N")) {
            validador = false;
            ps.apresentar(ps);

        }
    }
}
