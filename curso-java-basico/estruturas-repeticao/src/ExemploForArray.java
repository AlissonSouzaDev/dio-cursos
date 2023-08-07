public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice " + x + " é: " + alunos[x]);
        }

        // Também podemos usar um for each aqui

        System.out.println();
        for(String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}

