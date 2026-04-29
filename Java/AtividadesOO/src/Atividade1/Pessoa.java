package Atividade1;

public class Pessoa {

    String nome;
    int idade;

    public Pessoa() {
    }

    public void apresentar(Pessoa pessoa) {
        System.out.println("Seu nome é: " + pessoa.nome);
        System.out.println("Sua idade é: " + pessoa.idade);
    }

    public void fazerAniversario(Pessoa pessoa) {
        pessoa.idade = idade + 1;
    }

    // Get and Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
