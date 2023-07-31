public class Operadores {
    public static void main(String[] args) {

        // Operadores de Atribuição, Aritméticos e de Concatenação

        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);

        System.out.println();

        // Operadores Unários

        int numero = 5;

        System.out.println(- numero);

        System.out.println(numero);

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        System.out.println();

        System.out.println(numero ++);

        System.out.println(numero);

        System.out.println(++ numero);

        System.out.println(numero --);

        System.out.println(numero);

        System.out.println(-- numero);

        System.out.println();

        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(!variavel);

        System.out.println(variavel);

        System.out.println();

        // Operador Ternário

        // Exemplo utilizando if/else

        int a = 5;
        int b = 6;
        String resultado;

        if (a == b) {
            resultado = "Verdadeiro";
            System.out.println(resultado);
        } else {
            resultado = "Falso";
            System.out.println(resultado);
        }

        // Exemplo utilizando o Operador Ternário

        resultado = (a == b) ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        System.out.println();

        // Operadores Relacionais

        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;

        System.out.println("Numero 1 é igual ao Numero 2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente do Numero 2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero 1 é maior que o Numero 2? " + simNao);

        simNao = numero1 >= numero2;

        System.out.println("Numero 1 é maior ou igual ao Numero 2? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("Numero 1 é menor que o Numero 2? " + simNao);

        simNao = numero1 <= numero2;

        System.out.println("Numero 1 é menor ou igual ao Numero 2? " + simNao);

        System.out.println();

        String nomeUm = "Alisson";
        String nomeDois = "Alisson";

        // Para comparar textos e objetos nós não usamos os Operadores Relacionais e sim o equals

        System.out.println(nomeUm.equals(nomeDois));

        System.out.println();

        // Operadores Lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && !condicao2) {
            System.out.println("Ambas as condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("Fim");
    }
}