// qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
            System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
        }

        EstadoBrasileiro ufSelecionado = EstadoBrasileiro.SAO_PAULO;

        System.out.println(ufSelecionado.getNome());
        System.out.println(ufSelecionado.getSigla());
        System.out.println(ufSelecionado.getIbge());
        System.out.println(ufSelecionado.getNomeMaiusculo());
    }
}
