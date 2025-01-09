package exercicio2;

public class main {
    public static void main(String[] args) {

        Operacao soma = new Soma();
        Calculadora calculadoraSoma = new Calculadora(soma);
        System.out.println(calculadoraSoma.calcular(5, 5));

        Operacao subtracao = new Subtracao();
        Calculadora calculadoraSubtracao = new Calculadora(subtracao);
        System.out.println(calculadoraSubtracao.calcular(5, 5));

        Operacao multiplicacao = new Multiplicacao();
        Calculadora calculadoraMultiplicacao = new Calculadora(multiplicacao);
        System.out.println(calculadoraMultiplicacao.calcular(5, 5));
    }
}
