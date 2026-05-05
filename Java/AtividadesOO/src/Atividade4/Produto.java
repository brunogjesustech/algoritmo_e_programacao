package Atividade4;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto() {
    }

    public double calcularValorTotal() {

        return preco * quantidade;

    }

    public void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    // Getters 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
