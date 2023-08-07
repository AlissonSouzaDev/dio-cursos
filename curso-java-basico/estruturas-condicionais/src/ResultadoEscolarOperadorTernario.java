// Classe criada para demonstrar o funcionamento da estrutura de um operador ternário

public class ResultadoEscolarOperadorTernario {
    public static void main(String[] args) {
        int nota = 6;

        String resultado = nota >= 7
                ? "Aprovado"
                : nota >= 5 && nota < 7
                ? "Recuperação"
                : "Reprovado";

        System.out.println(resultado);
    }
}
