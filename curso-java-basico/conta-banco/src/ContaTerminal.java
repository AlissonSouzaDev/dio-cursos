import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Exibir as mensagens para o nosso usuário
        //TODO: Obter pela classe Scanner os valores digitados no terminal

        System.out.print("Bem-vindo ao nosso banco, para continuarmos, digite o seu nome completo: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Digite o número da conta desejada com 4 dígitos: ");
        int numeroConta = sc.nextInt();
        System.out.print("Digite o número da agência desejada com 4 dígitos no formato XXX-X: ");
        String agencia = sc.next();
        sc.nextLine();
        System.out.print("Por fim, digite o valor inicial a ser depositado na conta: ");
        double saldo = sc.nextDouble();

        //TODO: Exibir a mensagem conta criada

        System.out.println("Olá "
                + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia
                + ", conta "
                + numeroConta
                + " e seu saldo R$ "
                + String.format("%.2f", saldo)
                + " já está disponível para saque.");
    }
}
