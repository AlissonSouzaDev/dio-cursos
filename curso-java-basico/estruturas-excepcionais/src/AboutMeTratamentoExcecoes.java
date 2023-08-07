import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeTratamentoExcecoes {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite o seu nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite o seu sobrenome: ");
            String sobrenome = sc.nextLine();

            System.out.print("Digite a sua idade: ");
            int idade = sc.nextInt();

            System.out.print("Digite a sua altura: ");
            double altura = sc.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase().concat(" ").concat(sobrenome).toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + String.format("%.2f", altura) + " cm");

            sc.close();
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
