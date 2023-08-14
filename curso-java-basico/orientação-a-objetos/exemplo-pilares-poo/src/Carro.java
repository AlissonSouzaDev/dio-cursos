public class Carro extends Veiculo{

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    public void confereCambio() {
        System.out.println("Conferindo Câmbio em P");
    }

    public void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }
}
