public class FormatadorCep {
    public static void main(String[] args) {
       try {
           String cepFormatado = formatar("2376506");
           System.out.println(cepFormatado);
       } catch (CepInvalidoException e) {
           System.out.println("O cep não corresponde com as regras de negócio");
       }
    }
    static String formatar(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "23.765-064";
    }
}
