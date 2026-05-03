package Atividade3;

public class ContaBancaria {

    String titular;
    double saldo;

    public ContaBancaria() {
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente");
            System.exit(0);
        }
        saldo = saldo - valor;
    }

    public void mostrarSaldo() {
        System.out.println("Seu saldo é de : R$ " + saldo);
    }

    // Get e Set

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
