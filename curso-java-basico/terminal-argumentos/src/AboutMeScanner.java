import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = sc.next();
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = sc.next();
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();

        sc.close();
    }
}
