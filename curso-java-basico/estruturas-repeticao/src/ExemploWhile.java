import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int quantidadeDoces = 0;

        while(mesada > 0) {
            double valorDoce = valorAleatorio();

            if(valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: R$ " + String.format("%.2f", valorDoce) + " adicionado no carrinho.");
            mesada-= valorDoce;
            quantidadeDoces++;
        }
        System.out.println();
        System.out.println("Mesada: R$ " + String.format("%.2f", mesada));
        System.out.println("Joãozinho gastou toda a sua mesada e comprou " + quantidadeDoces + " doces.");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
