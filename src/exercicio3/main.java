package exercicio3;

public class main {
    public static void main(String[] args) {

        Forma quadrado = new Quadrado(5);
        Forma retangulo = new Retangulo(5, 4);

        System.out.println(quadrado.getArea());
        System.out.println(retangulo.getArea());
    }
}
