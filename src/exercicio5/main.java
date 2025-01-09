package exercicio5;

public class main {
    public static void main(String[] args) {

        DispositivoEntrada teclado = new Teclado();
        Computador computador = new Computador(teclado);
        computador.iniciarUsoDispositivo();
    }
}
