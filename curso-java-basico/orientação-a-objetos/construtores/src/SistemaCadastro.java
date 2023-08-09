public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        String nome = "Marcos";
        String cpf = "123.456.789-10";

        Pessoa marcos = new Pessoa(nome, cpf);

        //definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        //e como definir o nome e cpf do marcos ?

        //imprimindo o marcos sem o nome e cpf

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
