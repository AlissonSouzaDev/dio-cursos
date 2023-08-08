package candidatura;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    private final static String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO"
            , "MIRELA", "DANIELA", "JORGE"};
    private final static List<String> candidatosSelecionados = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Processo seletivo:");
        System.out.println();
        selecaoCandidatos();
        imprimirSelecionados();
        for(String candidato : candidatosSelecionados){
            ligarSelecionados(candidato);
        }
    }

    public static void selecaoCandidatos(){
        int quantidadeCandidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        try {
            while (quantidadeCandidatosSelecionados < 5) {
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O candidato " + candidato + " solicitou este valor de salário R$ "
                        + String.format("%.2f", salarioPretendido) + ".");
                if (salarioBase >= salarioPretendido) {
                    System.out.println("O candidato(a) " + candidato + " foi selecionado(a) para a vaga.");
                    candidatosSelecionados.add(candidato);
                    quantidadeCandidatosSelecionados++;
                } else {
                    System.out.println("O candidato(a) " + candidato + " está fora da seleção para a vaga.");
                }
                System.out.println();
                candidatoAtual++;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Não há mais candidatos concorrendo para a vaga!");
        }

        if (quantidadeCandidatosSelecionados == 5) {
            System.out.println("Todos os 5 candidatos foram selecionados para a vaga!");
        } else {
            System.out.println("Foram selecionados " + quantidadeCandidatosSelecionados + " candidatos para a vaga!");
        }
    }

    public static void imprimirSelecionados() {
        System.out.println();
        System.out.println("Candidatos selecionados:");
        for(int x = 0; x < candidatosSelecionados.size(); x++) {
            System.out.println((x + 1) + " - " + candidatosSelecionados.get(x));
        }
    }
    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    public static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    public static void ligarSelecionados(String candidato) {
        System.out.println();
        int tentativasRealizadas = 1;
        boolean continuarTentando;
        boolean atendeu;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +  " NA TENTATIVA " + tentativasRealizadas + ".");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato
                    + ", NÚMERO MÁXIMO DE TENTATIVAS REALIZADAS.");
        }
    }
}
