package Atividade2;

public class Calculadora {

    int a, b;
    double resultado;

    public Calculadora() {
    }

    public void somar(Calculadora cl) {
        cl.resultado = cl.a + cl.b;
        System.out.println("O resultado da soma é " + cl.resultado);
    }

    public void subtrair(Calculadora cl) {
        cl.resultado = cl.a - cl.b;
        System.out.println("O resultado da subtração é " + cl.resultado);
    }

    public void multiplicar(Calculadora cl) {
        cl.resultado = cl.a * cl.b;
        System.out.println("O resultado da multiplicação é " + cl.resultado);
    }

    public void dividir(Calculadora cl) {

        if (cl.a == 0 || cl.b == 0) {
            System.out.println("Erro de divisão por zero utilize outro valor");
            System.exit(0);
        }

        cl.resultado = cl.a / cl.b;
        System.out.println("O resultado da divisão é " + cl.resultado);

    }

    // Get and Set

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
