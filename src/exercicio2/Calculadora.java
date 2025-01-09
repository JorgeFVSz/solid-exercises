package exercicio2;

public class Calculadora {
    private Operacao operacao;

    public Calculadora(Operacao operacao) {
        this.operacao = operacao;
    }

    public int calcular(int a, int b) {
        return operacao.calcular(a, b);
    }
}
