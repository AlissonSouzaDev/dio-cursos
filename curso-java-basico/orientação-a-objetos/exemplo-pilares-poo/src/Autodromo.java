
public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.setChassi("84676872");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("26448548");
        z400.ligar();
    }
}
