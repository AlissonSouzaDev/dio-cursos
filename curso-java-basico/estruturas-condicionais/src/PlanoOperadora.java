/* Classe criada para demonstrar um exemplo aonde é melhor, a nível de sintaxe,
   a opção pelo switch-case em relação ao if-else
 */

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }

        /* Como ficaria utilizando if-else

        if(plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if(plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
        } else if(plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
            System.out.println("5Gb Youtube");
        }

            Percebe-se que, nesse caso, a estrutura switch-case traz uma maior
            economia de código, além de deixá-lo mais legível a nível de sintaxe
            */
        }
    }
}
