import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        int quantidadeToques = 0;

        do {
            System.out.println("Telefone tocando...");
            quantidadeToques++;
        } while (tocando());

        System.out.println("Alô...!");
        System.out.println("O telefone tocou " + quantidadeToques + " vez(es) até o amigo atender.");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
