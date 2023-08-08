import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            imprimirContagem(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior do que o primeiro!");
        }

        sc.close();
    }

    public static void imprimirContagem(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
           int contagem = parametroDois - parametroUm;

           for(int i = 0; i < contagem; i++) {
               System.out.println("Imprimindo o número " + (i + 1) + ".");
           }
        }
    }
}