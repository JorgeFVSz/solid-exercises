package exercicio5;

public class Computador {
    private DispositivoEntrada dispositivoEntrada;

    public Computador(DispositivoEntrada dispositivoEntrada) {
        this.dispositivoEntrada = dispositivoEntrada;
    }

    public void iniciarUsoDispositivo() {
        dispositivoEntrada.usar();
    }
}
